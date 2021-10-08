package leetcode.codingchallenge2021.october

import scala.collection.mutable

class Trie() {
  val children = new mutable.HashMap[Char, Trie]()
  var isTerm = false

  def insert(word: String): Unit = {
    var current = this
    for (c <- word) {
      if (!current.children.contains(c)) current.children += (c -> new Trie())
      current = current.children(c)
    }
    current.isTerm = true
  }

  def search(word: String): Boolean = searchAux(word).exists(_.isTerm)

  def startsWith(prefix: String): Boolean = searchAux(prefix).isDefined

  private def searchAux(word: String): Option[Trie] = {
    var current = this
    for (c <- word) {
      current.children.get(c) match {
        case None        => return None
        case Some(child) => current = child
      }
    }
    Some(current)
  }
}
