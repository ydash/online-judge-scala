package leetcode.codingchallenge2021.october

object RottingOrange {
  def orangesRotting(grid: Array[Array[Int]]): Int = {

    @scala.annotation.tailrec
    def loop(current: List[(Int, Int)], elapsed: Int): Int =
      if (current.isEmpty) {
        if (grid.forall(_.forall(v => v == 2 || v == 0))) elapsed
        else -1
      } else {
        var next = List[(Int, Int)]()
        for {
          (i, j) <- current
          (x, y) <- List((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
          if x < grid.length && x >= 0 && y < grid.head.length && y >= 0
          if grid(x)(y) == 1
        } {
          grid(x)(y) = 2
          next = (x, y) :: next
        }
        loop(next, if (next.isEmpty) elapsed else elapsed + 1)
      }

    val init = for (i <- grid.indices.toList; j <- grid(i).indices if grid(i)(j) == 2) yield (i, j)
    loop(init, 0)
  }
}
