package leetcode.codingchallenge2022.jan

// 1463. Cherry Pickup II
object P1463 {
  def cherryPickup(grid: Array[Array[Int]]): Int = {
    val rows = grid.length
    val cols = grid.head.length
    val dp = Array.fill[Int](rows, cols, cols)(-1)
    dp(0)(0)(cols - 1) = grid(0)(0) + grid(0)(cols - 1)
    for {
      i <- 0 until rows - 1
      j <- grid(i).indices
      k <- grid(i).indices
      if dp(i)(j)(k) >= 0
    } {
      for {
        a <- j - 1 to j + 1
        b <- k - 1 to k + 1
        if a >= 0 && a < cols && b >= 0 && b < cols
      } {
        val numOfCherry =
          if (a == b) dp(i)(j)(k) + grid(i + 1)(a)
          else dp(i)(j)(k) + grid(i + 1)(a) + grid(i + 1)(b)

        dp(i + 1)(a)(b) = dp(i + 1)(a)(b) max numOfCherry
      }
    }
    var result = 0
    for (j <- 0 until cols; k <- 0 until cols) result = result max dp.last(j)(k)
    result
  }
}
