package leetcode.codingchallenge2021.december
import scala.collection.mutable

// 1032. Stream of Characters
class StreamChecker(wordList: Array[String]) {
  val MAX_WORD_LENGTH = 2000
  val trie = new Trie()
  var charSequence: List[Char] = List()
  for (word <- wordList) trie.insert(word.reverse)

  def query(letter: Char): Boolean = {
    charSequence = (letter :: charSequence).take(MAX_WORD_LENGTH)
    var current = trie
    for (c <- charSequence) {
      current.child.get(c) match {
        case None => return false
        case Some(next) =>
          if (next.isTerm) return true
          current = next
      }
    }
    false
  }
}

class Trie {
  val child: mutable.Map[Char, Trie] = mutable.Map[Char, Trie]()
  var isTerm = false

  def insert(str: String): Unit = Trie.insert(this, str)

  def contains(str: String): Boolean = Trie.contains(this, str)
}
object Trie {
  private def insert(trie: Trie, str: String): Unit = {
    var current = trie
    for (c <- str) {
      if (!current.child.contains(c)) current.child += (c -> new Trie())
      current = current.child(c)
    }
    current.isTerm = true
  }
  private def contains(trie: Trie, str: String): Boolean = {
    var current = trie
    for (c <- str) {
      if (!current.child.contains(c)) return false
      current = current.child(c)
    }
    current.isTerm
  }
}
