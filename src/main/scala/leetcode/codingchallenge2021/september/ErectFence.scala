package leetcode.codingchallenge2021.september

import scala.collection.mutable

object ErectFence {
  def outerTrees(trees: Array[Array[Int]]): Array[Array[Int]] = {
    trees.sortInPlaceWith { case (Array(x1, y1), Array(x2, y2)) => if (x1 == x2) y1 <= y2 else x1 < x2 }
    val upper = mutable.Stack[Array[Int]]()
    val lower = mutable.Stack[Array[Int]]()

    for (p <- trees) {
      while (upper.length >= 2 && slope(upper(1), upper(0)) < slope(upper(0), p)) upper.pop()
      p +=: upper
    }

    for (i <- trees.indices.reverse; p = trees(i)) {
      while (lower.length >= 2 && slope(lower(0), lower(1)) < slope(p, lower(0))) lower.pop()
      p +=: lower
    }

    val result = mutable.Set[Array[Int]]()
    result ++= upper
    result ++= lower
    result.toArray
  }

  private val slope: (Array[Int], Array[Int]) => Double = { case (Array(x1, y1), Array(x2, y2)) =>
    (y2 - y1) / (x2 - x1).toDouble
  }

}
