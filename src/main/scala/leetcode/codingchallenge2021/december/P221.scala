package leetcode.codingchallenge2021.december

// 221. Maximal Square
object P221 {
  def maximalSquare(matrix: Array[Array[Char]]): Int = {
    val m = matrix.length
    val n = matrix(m - 1).length
    val dp = matrix.map(r => r.map(_.getNumericValue))
    var maxSideLength = dp.head.max max dp.map(_(0)).max
    for (i <- 1 until m; j <- 1 until n if dp(i)(j) == 1) {
      dp(i)(j) = (dp(i - 1)(j) min dp(i - 1)(j - 1) min dp(i)(j - 1)) + 1
      maxSideLength = maxSideLength max dp(i)(j)
    }
    maxSideLength * maxSideLength
  }
}
