package leetcode.codingchallenge2021.september

object ShortestPathInAGridWithObstaclesElimination {
  def shortestPath(grid: Array[Array[Int]], k: Int): Int = {
    val m = grid.length - 1
    val n = grid.head.length - 1
    val visited = Array.fill(m + 1)(Array.fill(n + 1)(-1))
    visited(0)(0) = k
    val pq = scala.collection.mutable.PriorityQueue[(Int, (Int, Int), Int)](Tuple3(0, (0, 0), k))(Ordering.by(-_._1))

    while (pq.nonEmpty) {
      val (steps, i -> j, rest) = pq.dequeue()
      if (i == m && j == n) return steps
      for (
        p @ (a, b) <- Array((i, j - 1), (i, j + 1), (i + 1, j), (i - 1, j))
        if a <= m && b <= n && a >= 0 && b >= 0
        if rest - grid(a)(b) > visited(a)(b)
      ) {
        visited(a)(b) = rest - grid(a)(b)
        pq enqueue Tuple3(steps + 1, p, rest - grid(a)(b))
      }
    }

    -1
  }
}
