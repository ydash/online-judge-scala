package leetcode.codingchallenge2022.apr

// 59. Spiral Matrix II
object P59 {
  def generateMatrix(n: Int): Array[Array[Int]] = {
    def get(arr: Array[Array[Int]], i: Int, j: Int): Int = arr.lift(i).flatMap(_.lift(j)).getOrElse(-1)

    val matrix = Array.ofDim[Int](n, n)
    var current = 1
    val lim = n * n
    var i = 0
    var j = 0
    while (current <= lim) {
      while (get(matrix, i, j) == 0) {
        matrix(i)(j) = current
        current += 1
        j += 1
      }
      j -= 1
      i += 1
      while (get(matrix, i, j) == 0) {
        matrix(i)(j) = current
        current += 1
        i += 1
      }
      i -= 1
      j -= 1
      while (get(matrix, i, j) == 0) {
        matrix(i)(j) = current
        current += 1
        j -= 1
      }
      j += 1
      i -= 1
      while (get(matrix, i, j) == 0) {
        matrix(i)(j) = current
        current += 1
        i -= 1
      }
      i += 1
      j += 1
    }
    matrix
  }
}
