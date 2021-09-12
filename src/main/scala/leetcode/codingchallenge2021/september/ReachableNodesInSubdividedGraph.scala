package leetcode.codingchallenge2021.september

import scala.collection.mutable

object ReachableNodesInSubdividedGraph {
  def reachableNodes(edges: Array[Array[Int]], maxMoves: Int, n: Int): Int = {
    val seen = new Array[Boolean](n)
    val adj = Array.fill(n)(mutable.Map[Int, Int]())
    for (Array(u, v, c) <- edges) {
      adj(u).put(v, c)
      adj(v).put(u, c)
    }
    val pq = mutable.PriorityQueue[(Int, Int)](0 -> maxMoves)(Ordering.by(_._2))
    var count = 0
    while (pq.nonEmpty) {
      val (current, remain) = pq.dequeue()
      if (!seen(current)) {
        count += 1
        seen(current) = true
        for ((next, cnt) <- adj(current)) {
          if (remain > cnt && !seen(next)) {
            pq.enqueue(next -> (remain - cnt - 1))
          }
          val d = remain min cnt
          adj(next)(current) -= d
          count += d
        }
      }
    }

    count
  }
}
