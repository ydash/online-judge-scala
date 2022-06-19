package leetcode.codingchallenge2022.jun

// 1268. Search Suggestions System
object P1268 {
  def suggestedProducts(products: Array[String], searchWord: String): List[List[String]] = {
    val result = collection.mutable.ListBuffer[List[String]]()
    products.sortInPlace()
    var current = Option(Trie.buildOf(products))
    for (c <- searchWord) {
      current = current.flatMap(_.next(c))
      result += current.map(_.candidates.take(3).map(products(_)).toList).fold(List.empty[String])(it => it)
    }
    result.toList
  }

  case class Trie() {
    private val children = Array.fill[Option[Trie]]('z' - 'a' + 1)(None)
    val candidates: collection.mutable.ArrayBuffer[Int] = collection.mutable.ArrayBuffer[Int]()
    private def addWord(word: String, i: Int): Trie = Trie.addWord(this, word, i)
    def next(char: Char): Option[Trie] = children(char - 'a')
  }

  object Trie {
    def buildOf(words: Array[String]): Trie =
      words.zipWithIndex.foldLeft(Trie()) { case (acc, (word, i)) => acc.addWord(word, i) }

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
        current.candidates += index
      }
      root
    }
  }
}
