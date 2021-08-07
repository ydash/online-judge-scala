package leetcode.codingchallenge2021.august

object PalindromePartitioningII {
  def minCut(s: String): Int = {
    val dp = Array.tabulate(s.length)(i => i)
    for (i <- dp.indices) {
      updateDp(dp, s, i, i)
      updateDp(dp, s, i, i + 1)
    }
    dp.last
  }

  @scala.annotation.tailrec
  def updateDp(dp: Array[Int], s: String, left: Int, right: Int): Unit = {
    if (left >= 0 && right < s.length && s(left) == s(right)) {
      if (left == 0) dp(right) = 0
      else dp(right) = dp(right) min dp(left - 1) + 1
      updateDp(dp, s, left - 1, right + 1)
    }
  }
}
