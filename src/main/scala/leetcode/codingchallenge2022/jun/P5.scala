package leetcode.codingchallenge2022.jun

object P5 {
  def longestPalindrome(s: String): String = {
    @scala.annotation.tailrec
    def aux(left: Int, right: Int): (Int, Int) = {
      if (left >= 0 && right < s.length && s(left) == s(right)) aux(left - 1, right + 1)
      else (left + 1, right - 1)
    }
    var result = ""
    for (i <- s.indices) {
      val (left, right) = aux(i, i)
      if (result.length < right - left + 1) result = s.substring(left, right + 1)
    }
    for (i <- s.indices.drop(1) if s(i - 1) == s(i)) {
      val (left, right) = aux(i - 1, i)
      if (result.length < right - left + 1) result = s.substring(left, right + 1)
    }
    result
  }
}
