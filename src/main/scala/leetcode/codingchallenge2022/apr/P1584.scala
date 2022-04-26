package leetcode.codingchallenge2022.apr

import scala.collection.mutable

// 1584. Min Cost to Connect All Points
object P1584 {
  def minCostConnectPoints(points: Array[Array[Int]]): Int = {
    val remain = mutable.Set[Int](points.indices: _*)
    val pq = mutable.PriorityQueue[(Int, Int)]((0, 0))(Ordering.by(-_._2))
    var minCost = 0

    while (remain.nonEmpty) {
      val (i, cost) = pq.dequeue()
      if (remain.contains(i)) {
        minCost += cost
        remain -= i
        for (j <- remain) {
          val Array(a, b) = points(i)
          val Array(c, d) = points(j)
          val dist = (a - c).abs + (b - d).abs
          pq += (j -> dist)
        }
      }
    }
    minCost
  }
}
