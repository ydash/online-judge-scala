package leetcode.codingchallenge2022.jun

// 51. N-Queens
object P51 {
  def solveNQueens(n: Int): List[List[String]] = {
    val col = new Array[Boolean](n)
    val downward, upward = new Array[Boolean](2 * n - 1)
    val result = collection.mutable.ListBuffer[List[String]]()
    def backtracking(i: Int, acc: List[Int]): Unit = {
      if (i >= n) result += acc.foldLeft(Nil: List[String]) { case (acc, j) =>
        (("." * (j - 0)) + "Q" + ("." * (n - j - 1))) :: acc
      }
      else {
        for (j <- 0 until n if !col(j) && !downward(i - j + n - 1) && !upward(i + j)) {
          col(j) = true
          downward(i - j + n - 1) = true
          upward(i + j) = true
          backtracking(i + 1, j :: acc)
          col(j) = false
          downward(i - j + n - 1) = false
          upward(i + j) = false
        }
      }
    }
    backtracking(0, Nil)
    result.toList
  }
}
