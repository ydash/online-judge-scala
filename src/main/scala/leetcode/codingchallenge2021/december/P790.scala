package leetcode.codingchallenge2021.december

// 790. Domino and Tromino Tiling
object P790 {
  def numTilings(n: Int): Int = {
    val mod = (1e9 + 7).toInt
    val dp = new Array[Long](n + 1)
    dp(0) = 1
    for (i <- 0 until n) {
      if (i + 1 <= n) dp(i + 1) = (dp(i + 1) + dp(i)) % mod
      if (i + 2 <= n) dp(i + 2) = (dp(i + 2) + dp(i)) % mod
      for (j <- i + 3 to n) dp(j) = (dp(j) + 2 * dp(i)) % mod
    }
    dp.last.toInt
  }
}
