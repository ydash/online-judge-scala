package leetcode.codingchallenge2021.december

// 790. Domino and Tromino Tiling
object P790 {
  def numTilings(n: Int): Int = {
    val mod = (1e9 + 7).toInt
    val dp = new Array[Long](1000)
    dp(0) = 1
    dp(1) = 2
    dp(2) = 5
    for (i <- 3 until n) dp(i) = (2 * dp(i - 1) + dp(i - 3)) % mod
    dp(n - 1).toInt
  }
}
