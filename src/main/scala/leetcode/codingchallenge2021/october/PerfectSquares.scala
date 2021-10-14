package leetcode.codingchallenge2021.october

object PerfectSquares {
  def numSquares(n: Int): Int = {
    val dp = Array.tabulate(n + 1) { i => i }
    for (i <- dp.indices) {
      var j = 2
      while (j * j <= i) {
        dp(i) = dp(i) min (dp(i - j * j) + 1)
        j += 1
      }
    }
    dp.last
  }
}
