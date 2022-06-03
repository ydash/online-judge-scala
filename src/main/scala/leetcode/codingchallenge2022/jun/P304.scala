package leetcode.codingchallenge2022.jun

// 304. Range Sum Query 2D - Immutable
object P304 {
  class NumMatrix(_matrix: Array[Array[Int]]) {
    private val n = _matrix.length
    private val m = _matrix.head.length
    private val sum = Array.ofDim[Int](n + 1, m + 1)
    for (i <- 1 to n; j <- 1 to m)
      sum(i)(j) = _matrix(i - 1)(j - 1) + sum(i)(j - 1) + sum(i - 1)(j) - sum(i - 1)(j - 1)

    def sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int =
      sum(row2 + 1)(col2 + 1) - sum(row1)(col2 + 1) - sum(row2 + 1)(col1) + sum(row1)(col1)

  }
}
