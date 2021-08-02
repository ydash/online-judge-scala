package leetcode.codingchallenge2021.august

import util.DisjointSet

object MakingLargeIsland {
  def largestIsland(grid: Array[Array[Int]]): Int = {
    val n = grid.length
    val ds = new DisjointSet(n * n)
    var ans = 1

    for (
      i <- grid.indices;
      j <- grid(i).indices if grid(i)(j) == 1;
      x = i * n + j
    ) {
      if (i + 1 < n && grid(i + 1)(j) == 1) ds.union(x, (i + 1) * n + j)
      if (j + 1 < n && grid(i)(j + 1) == 1) ds.union(x, i * n + j + 1)
      ans = ans max ds.size(x)
    }

    for (
      i <- grid.indices;
      j <- grid.indices if grid(i)(j) == 0
    ) {
      val xs = List((i - 1, j), (i + 1, j), (i, j - 1), (i, j + 1))
        .withFilter { case (a, b) => a >= 0 && b >= 0 && a < n && b < n && grid(a)(b) == 1 }
        .map { case (a, b) => a * n + b }
        .foldLeft(List.empty[Int]) { (acc, x) =>
          if (acc.exists(y => ds.same(x, y))) acc
          else x :: acc
        }
      ans = ans max xs.foldLeft(1)((acc, x) => acc + ds.size(x))
    }

    ans
  }
}
