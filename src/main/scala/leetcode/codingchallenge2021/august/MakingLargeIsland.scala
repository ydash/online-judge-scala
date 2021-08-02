package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object MakingLargeIsland {
  def largestIsland(grid: Array[Array[Int]]): Int = {
    val n = grid.length
    val ds = new UnionFindTree(n * n)
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

class UnionFindTree(n: Int) {
  val parent = new Array[Int](n)
  parent.indices.foreach(i => parent(i) = -1)

  @tailrec
  private final def findSet(x: Int): Int = if (parent(x) < 0) x else findSet(parent(x))

  def same(x: Int, y: Int): Boolean = findSet(x) == findSet(y)

  def union(x: Int, y: Int): Unit = link(findSet(x), findSet(y))

  private def link(x: Int, y: Int): Unit = {
    if (x != y) {
      parent(x) += parent(y)
      parent(y) = x
    }
  }

  def size(x: Int): Int = -parent(findSet(x))
}
