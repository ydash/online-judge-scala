package leetcode.codingchallenge2022.apr

// 59. Spiral Matrix II
object P59 {
  def generateMatrix(n: Int): Array[Array[Int]] = {
    val matrix = Array.ofDim[Int](n, n)
    var i, j = 0
    var (di, dj) = (0, 1)
    for (x <- 1 to n * n) {
      matrix(i)(j) = x
      if (matrix.lift(i + di).flatMap(_.lift(j + dj)).getOrElse(-1) != 0) {
        val tmp = di
        di = dj
        dj = -tmp
      }
      i += di
      j += dj
    }
    matrix
  }
}
