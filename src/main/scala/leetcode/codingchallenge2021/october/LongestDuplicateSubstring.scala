package leetcode.codingchallenge2021.october

object LongestDuplicateSubstring {
  def longestDupSubstring(s: String): String = {
    def findK(k: Int): Option[String] = {
      val base = 31
      val mod = Long.MaxValue
      val p = BigInt(base).modPow(k, mod)
      var hash = (0 until k).foldLeft(BigInt(0))((acc, i) => ((acc * base) + (s(i) - 'a')) % mod)
      var cache = Set(hash)
      var i = k
      while (i < s.length) {
        hash = ((hash * base + (s(i) - 'a') - (s(i - k) - 'a') * p) % mod + mod) % mod
        if (cache.contains(hash)) {
          if (cache contains hash) return Some(s.substring(i - k + 1, i + 1))
        }
        cache = cache + hash
        i += 1
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
