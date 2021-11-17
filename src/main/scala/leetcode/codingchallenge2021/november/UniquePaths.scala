package leetcode.codingchallenge2021.november

object UniquePaths {
  def uniquePaths(m: Int, n: Int): Int = {
    val dp = new Array[Int](n + 1)
    dp(1) = 1
    for (_ <- 0 until m) {
      for (j <- 1 to n) {
        dp(j) = dp(j) + dp(j - 1)
      }
    }
    dp(n)
  }
}
