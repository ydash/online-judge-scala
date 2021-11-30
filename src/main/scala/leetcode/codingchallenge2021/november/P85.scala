package leetcode.codingchallenge2021.november

// 85. Maximal Rectangle
object P85 {
  def maximalRectangle(matrix: Array[Array[Char]]): Int = {
    val n = matrix.headOption.map(_.length).getOrElse(0)
    val height, left = new Array[Int](n)
    val right = Array.fill(n)(n)
    var answer = 0
    for (i <- matrix.indices) {
      var lp = 0
      var rp = n
      for (j <- 0 until n) {
        if (matrix(i)(j) == '1') {
          height(j) += 1
          left(j) = left(j) max lp
        } else {
          height(j) = 0
          left(j) = 0
          lp = j + 1
        }
      }
      for (j <- (0 until n).reverse) {
        if (matrix(i)(j) == '1') right(j) = right(j) min rp
        else {
          right(j) = n
          rp = j
        }
      }
      for (j <- 0 until n) answer = answer max (right(j) - left(j)) * height(j)
    }
    answer
  }
}
