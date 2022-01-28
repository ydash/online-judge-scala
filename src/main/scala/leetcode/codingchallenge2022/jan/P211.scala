package leetcode.codingchallenge2022.jan

class WordDictionary() {
  private val trie = new Trie

  def addWord(word: String): Unit = trie.addWord(word)

  def search(word: String): Boolean = trie.search(word)

}

class Trie {
  import Trie._

  private val children = Array.fill[Option[Trie]](numOfAlphabets)(None)

  private var isTerm: Boolean = false

  def addWord(word: String): Unit = Trie.addWord(this, word)

  def search(word: String): Boolean = Trie.search(this, word)
}
object Trie {
  val numOfAlphabets: Int = 'z' - 'a' + 1

  def addWord(trie: Trie, word: String): Unit = {
    var current = trie
    for (c <- word) {
      current.children(c - 'a') match {
        case None =>
          val newChild = new Trie
          current.children(c - 'a') = Option(newChild)
          current = newChild
        case Some(child) =>
          current = child
      }
    }
    current.isTerm = true
  }

  def search(trie: Trie, word: String): Boolean = {
    var current = trie
    for (i <- word.indices) {
      if (word(i) == '.') return current.children.exists(_.fold(false)(child => search(child, word.substring(i + 1))))
      current.children(word(i) - 'a') match {
        case None        => return false
        case Some(child) => current = child
      }
    }
    current.isTerm
  }
}
