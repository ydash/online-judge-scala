package leetcode.codingchallenge2022.jun

// 820. Short Encoding of Words
object P820 {
  def minimumLengthEncoding(words: Array[String]): Int = {
    val root = Trie()
    words.toSet.toArray
      .map(root.addWordInReverse)
      .foldLeft(0)((acc, node) => if (node.hasNext) acc else acc + node.depth)
  }

  private case class Trie() {
    private val children = Array.fill[Option[Trie]]('z' - 'a' + 1)(None)
    var depth = 0
    def addWordInReverse(word: String): Trie = Trie.addWordInReverse(this, word)
    def hasNext: Boolean = children.exists(_.isDefined)
  }
  private object Trie {
    def addWordInReverse(root: Trie, word: String): Trie = {
      var current = root
      for (i <- word.indices.reverse) {
        val j = word(i) - 'a'
        current.children(j) match {
          case None =>
            val child = Trie()
            current.children(j) = Option(child)
            current = child
          case Some(child) => current = child
        }
      }
      current.depth = word.length + 1
      current
    }
  }
}
