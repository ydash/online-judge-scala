package leetcode.codingchallenge2022.mar

// 1337. The K Weakest Rows in a Matrix
object P1337 {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    val strength = mat.map { row =>
      @scala.annotation.tailrec
      def binSearch(left: Int, right: Int): Int = {
        if (left > right) left
        else {
          val mid = (left + right) / 2
          if (row(mid) == 1) binSearch(mid + 1, right)
          else binSearch(left, mid - 1)
        }
      }
      binSearch(0, row.length - 1)
    }
    mat.indices.sortBy(strength).take(k).toArray
  }
}
