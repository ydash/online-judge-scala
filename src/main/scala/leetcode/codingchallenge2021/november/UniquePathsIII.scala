package leetcode.codingchallenge2021.november

// 980. Unique Paths III
object UniquePathsIII {
  def uniquePathsIII(grid: Array[Array[Int]]): Int = {
    val m = grid.length
    val n = grid.head.length
    val haveToPass = grid.foldLeft(0) { (acc, r) => r.foldLeft(acc) { (a, c) => if (c != -1) a + 1 else a } }
    val (si, sj) = (for (i <- 0 until m; j <- 0 until n if grid(i)(j) == 1) yield (i, j)).head
    var count = 0

    def backtracking(i: Int, j: Int, passed: Int): Unit = {
      if (grid(i)(j) == 2) {
        if (passed == haveToPass) count += 1
      } else {
        grid(i)(j) = -1
        for (
          (x, y) <- List((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
          if x >= 0 && x < m && y >= 0 && y < n && grid(x)(y) != -1
        ) {
          backtracking(x, y, passed + 1)
        }
        grid(i)(j) = 0
      }
    }

    grid(si)(sj) = -1
    backtracking(si, sj, 1)
    count
  }
}
