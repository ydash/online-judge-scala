package leetcode.codingchallenge2021.september

import scala.collection.mutable.ListBuffer

object SpiralMatrix {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    val m = matrix.length
    val n = matrix.head.length
    val buffer = ListBuffer[Int]()
    val seen = Array.ofDim[Boolean](m, n)

    var i = 0
    var j = 0
    while ((0 until m contains i) && (0 until n contains j) && !seen(i)(j)) {
      while (j < n && !seen(i)(j)) {
        buffer += matrix(i)(j)
        seen(i)(j) = true
        j += 1
      }
      j -= 1
      i += 1
      while (i < m && !seen(i)(j)) {
        buffer += matrix(i)(j)
        seen(i)(j) = true
        i += 1
      }
      j -= 1
      i -= 1
      while (j >= 0 && !seen(i)(j)) {
        buffer += matrix(i)(j)
        seen(i)(j) = true
        j -= 1
      }
      j += 1
      i -= 1
      while (i >= 0 && !seen(i)(j)) {
        buffer += matrix(i)(j)
        seen(i)(j) = true
        i -= 1
      }
      j += 1
      i += 1
    }

    buffer.toList
  }
}
