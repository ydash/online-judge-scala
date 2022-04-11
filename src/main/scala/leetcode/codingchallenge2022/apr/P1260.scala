package leetcode.codingchallenge2022.apr

// 1260. Shift 2D Grid
object P1260 {
  def shiftGrid(grid: Array[Array[Int]], _k: Int): List[List[Int]] = {
    val m = grid.length
    val n = grid.head.length
    val size = m * n
    val k = _k % size
    for (i <- grid.indices.toList) yield {
      for (j <- grid(i).indices.toList) yield {
        val p = (size + i * n + j - k) % size
        grid(p / n)(p % n)
      }
    }
  }
}
