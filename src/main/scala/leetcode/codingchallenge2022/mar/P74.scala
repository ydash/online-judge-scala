package leetcode.codingchallenge2022.mar

// 74. Search a 2D Matrix
object P74 {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    val m = matrix.length
    val n = matrix.head.length
    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Boolean = {
      if (left > right) false
      else {
        val mid = (left + right) / 2
        val i = mid / n
        val j = mid % n
        if (matrix(i)(j) == target) true
        else if (matrix(i)(j) < target) binSearch(mid + 1, right)
        else binSearch(left, mid - 1)
      }
    }
    binSearch(0, m * n - 1)
  }
}
