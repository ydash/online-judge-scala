package leetcode.codingchallenge2022.may

// 63. Unique Paths II
object P63 {
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid.head.length
    val dp = new Array[Int](n)
    dp(0) = 1
    for (i <- 0 until m; j <- 0 until n) {
      if (obstacleGrid(i)(j) == 1) dp(j) = 0
      else if (j > 0) dp(j) += dp(j - 1)
    }
    dp.last
  }
}
