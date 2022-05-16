package leetcode.codingchallenge2022.may

// 1091. Shortest Path in Binary Matrix
object P1091 {
  def shortestPathBinaryMatrix(grid: Array[Array[Int]]): Int = {
    val n = grid.length
    val direction = Seq((-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1))
    val queue = collection.mutable.Queue[(Int, (Int, Int))]()
    if (grid(0)(0) == 0 && grid(n - 1)(n - 1) == 0) {
      queue += (1 -> (0, 0))
      grid(0)(0) = 1
    }
    while (queue.nonEmpty) {
      val (len, (i, j)) = queue.dequeue()
      if (i == n - 1 && j == n - 1) return len
      for {
        (di, dj) <- direction
        b <- grid.lift(i + di).flatMap(_.lift(j + dj))
        if b == 0
      } {
        queue += (len + 1 -> (i + di, j + dj))
        grid(i + di)(j + dj) = 1
      }
    }
    -1
  }
}
