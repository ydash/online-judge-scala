package leetcode.codingchallenge2022.mar

// 316. Remove Duplicate Letters
object P316 {
  def removeDuplicateLetters(s: String): String = {
    val buffer = new collection.mutable.ArrayBuffer[Char]()
    val seen = collection.mutable.Set[Int]()
    val lastIndexOf = s.indices.foldLeft(Map[Char, Int]()) { (acc, i) => acc + (s(i) -> i) }
    for (i <- s.indices if !seen.contains(s(i))) {
      val c = s(i)
      while (buffer.nonEmpty && c < buffer.last && lastIndexOf(buffer.last) > i) {
        seen -= buffer.last
        buffer.dropRightInPlace(1)
      }
      seen += c
      buffer += c
    }
    buffer.mkString
  }
}
