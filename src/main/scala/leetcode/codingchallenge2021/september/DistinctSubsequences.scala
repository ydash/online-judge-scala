package leetcode.codingchallenge2021.september

object DistinctSubsequences {
  def numDistinct(s: String, t: String): Int = {
    val dp = Array.ofDim[Int](t.length + 1, s.length + 1)
    for (j <- 0 to s.length) dp(0)(j) = 1

    for (i <- 0 until t.length; j <- i until s.length) {
      if (t(i) == s(j)) dp(i + 1)(j + 1) = dp(i)(j) + dp(i + 1)(j)
      else dp(i + 1)(j + 1) = dp(i + 1)(j)
    }

    dp.last.last
  }
}
