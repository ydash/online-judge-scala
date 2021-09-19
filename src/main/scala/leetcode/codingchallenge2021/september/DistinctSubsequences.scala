package leetcode.codingchallenge2021.september

object DistinctSubsequences {
  def numDistinct(s: String, t: String): Int = {
    val dp = Array.ofDim[Int](t.length, s.length)
    if (s(0) == t(0)) dp(0)(0) = 1
    for (j <- 1 until s.length) {
      dp(0)(j) = dp(0)(j - 1) + (if (t(0) == s(j)) 1 else 0)
    }
    for (i <- 1 until t.length) {
      for (j <- i until s.length) {
        if (t(i) == s(j)) dp(i)(j) = dp(i - 1)(j - 1) + dp(i)(j - 1)
        else dp(i)(j) = dp(i)(j - 1)
      }
    }

    dp.last.last
  }
}
