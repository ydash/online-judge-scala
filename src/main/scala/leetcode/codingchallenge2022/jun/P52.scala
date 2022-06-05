package leetcode.codingchallenge2022.jun

// 52. N-Queens II
object P52 {
  def totalNQueens(n: Int): Int = {
    val col = new Array[Boolean](n)
    val downward, upward = new Array[Boolean](2 * n - 1)
    var result = 0
    def backtracking(i: Int): Unit = {
      if (i >= n) result += 1
      else {
        for (j <- 0 until n if !col(j) && !downward(i - j + n - 1) && !upward(i + j)) {
          col(j) = true
          downward(i - j + n - 1) = true
          upward(i + j) = true
          backtracking(i + 1)
          col(j) = false
          downward(i - j + n - 1) = false
          upward(i + j) = false
        }
      }
    }
    backtracking(0)
    result
  }
}
