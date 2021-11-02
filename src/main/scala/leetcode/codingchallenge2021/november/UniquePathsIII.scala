package leetcode.codingchallenge2021.november

object UniquePathsIII {
  def uniquePathsIII(grid: Array[Array[Int]]): Int = {
    val m = grid.length
    val n = grid.head.length
    val haveToPass = grid.foldLeft(0) { (acc, r) => r.foldLeft(acc) { (a, c) => if (c != -1) a + 1 else a } }
    val (si, sj) = (for (i <- 0 until m; j <- 0 until n if grid(i)(j) == 1) yield (i, j)).head

    var count = 0
    val seen = Array.ofDim[Boolean](m, n)
    seen(si)(sj) = true

    def backtracking(i: Int, j: Int, passed: Int): Unit = {
      if (grid(i)(j) == 2) {
        if (passed == haveToPass) count += 1
      } else {
        for (
          (x, y) <- List((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
          if x >= 0 && x < m && y >= 0 && y < n && grid(x)(y) != -1 && !seen(x)(y)
        ) {
          seen(x)(y) = true
          backtracking(x, y, passed + 1)
          seen(x)(y) = false
        }
      }
    }

    backtracking(si, sj, 1)
    count
  }
}
