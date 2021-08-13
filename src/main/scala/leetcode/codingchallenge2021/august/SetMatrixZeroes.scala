package leetcode.codingchallenge2021.august

object SetMatrixZeroes {
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    val m = matrix.length
    val n = matrix.head.length
    val colHeaderFlag = matrix.head.contains(0)
    val rowHeaderFlag = (for (i <- 0 until m) yield matrix(i)(0)).contains(0)
    for (i <- 1 until m; j <- 1 until n if matrix(i)(j) == 0) {
      matrix(i)(0) = 0
      matrix(0)(j) = 0
    }
    for (i <- 1 until m; j <- 1 until n if matrix(i)(0) == 0 || matrix(0)(j) == 0) matrix(i)(j) = 0
    if (colHeaderFlag) for (j <- 0 until n) matrix(0)(j) = 0
    if (rowHeaderFlag) for (i <- 0 until m) matrix(i)(0) = 0
  }
}
