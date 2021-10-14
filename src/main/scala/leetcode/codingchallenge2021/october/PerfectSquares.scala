package leetcode.codingchallenge2021.october

object PerfectSquares {
  def numSquares(n: Int): Int = {
    val dp = Array.tabulate(n + 1) { i => i }
    val perfects = LazyList.from(2).map(i => i * i).takeWhile(_ <= n)
    for (i <- dp.indices; p <- perfects if i + p <= n) {
      dp(i + p) = dp(i + p) min (dp(i) + 1)
    }
    dp.last
  }
}
