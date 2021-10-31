package leetcode.codingchallenge2021.october

object LongestDuplicateSubstring {
  def longestDupSubstring(s: String): String = {
    def findK(k: Int): Option[String] = {
      var seen = Set[String]()
      for (i <- s.indices.dropRight(k - 1)) {
        val substring = s.substring(i, i + k)
        if (seen contains substring) return Some(substring)
        seen += substring
      }
      None
    }

    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int, acc: String = ""): String =
      if (right < left) acc
      else {
        val mid = (right + left) / 2
        findK(mid) match {
          case None            => binSearch(left, mid - 1, acc)
          case Some(substring) => binSearch(mid + 1, right, substring)
        }
      }

    binSearch(1, s.length - 1)
  }
}
