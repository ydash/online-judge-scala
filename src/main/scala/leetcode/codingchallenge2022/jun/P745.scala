package leetcode.codingchallenge2022.jun

// 745. Prefix and Suffix Search
object P745 {
  class WordFilter(_words: Array[String]) {
    private val trie = Trie.buildOf(_words)

    def f(prefix: String, suffix: String): Int = trie.findIndex(s"$suffix{$prefix")

  }

  case class Trie() {
    private val children = Array.fill[Option[Trie]](27)(None)
    private var index = -1
    def findIndex(str: String): Int = Trie.findIndex(this, str)
  }

  object Trie {
    def buildOf(words: Array[String]): Trie =
      words.zipWithIndex.foldLeft(Trie()) { case (acc, (word, i)) =>
        word.indices.foldLeft(acc) { (a, si) =>
          addWord(a, s"${word.substring(si)}{$word", i)
        }
      }

    private def addWord(root: Trie, word: String, index: Int): Trie = {
      var current = root
      for (c <- word) {
        val i: Int = c - 'a'
        current.children(i) match {
          case None =>
            val child = Trie()
            current.children(i) = Option(child)
            current = child
          case Some(child) => current = child
        }
        current.index = index
      }
      root
    }

    private def findIndex(trie: Trie, str: String): Int = {
      var current = trie
      for (c <- str) {
        val i: Int = c - 'a'
        current.children(i) match {
          case None        => return -1
          case Some(child) => current = child
        }
      }
      current.index
    }
  }
}
