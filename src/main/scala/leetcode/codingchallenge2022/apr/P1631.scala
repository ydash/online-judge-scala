package leetcode.codingchallenge2022.apr

// 1631. Path With Minimum Effort
object P1631 {
  def minimumEffortPath(heights: Array[Array[Int]]): Int = {
    val row = heights.length
    val col = heights.head.length
    val minEffort = Array.fill(row)(Array.fill(col)(Int.MaxValue))
    val pq = collection.mutable.PriorityQueue[(Int, Int, Int)]((0, 0, 0))(Ordering.by(-_._1))
    while (pq.nonEmpty) {
      val (e, i, j) = pq.dequeue()
      if (i == row - 1 && j == col - 1) return e
      for {
        (a, b) <- Array((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
        if a >= 0 && a < row && b >= 0 && b < col
      } {
        val maxEffort = e max (heights(i)(j) - heights(a)(b)).abs
        if (maxEffort < minEffort(a)(b)) {
          minEffort(a)(b) = maxEffort
          pq.enqueue((maxEffort, a, b))
        }
      }
    }
    -1
  }
}
