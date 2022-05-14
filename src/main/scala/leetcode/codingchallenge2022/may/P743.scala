package leetcode.codingchallenge2022.may

import scala.collection.mutable

// 743. Network Delay Time
object P743 {
  def networkDelayTime(times: Array[Array[Int]], n: Int, k: Int): Int = {
    val seen = mutable.Set[Int]()
    val pq = mutable.PriorityQueue[(Int, Int)]((k, 0))(Ordering.by(-_._2))
    val dist = times.foldLeft(Map[Int, List[(Int, Int)]]().withDefaultValue(Nil)) { case (acc, Array(a, b, d)) =>
      acc.updatedWith(a) {
        case Some(lst) => Option((b, d) :: lst)
        case None      => Option(List(b -> d))
      }
    }
    while (pq.nonEmpty) {
      val (node, time) = pq.dequeue()
      if (!seen.contains(node)) {
        seen += node
        dist(node).foreach { case (n, t) => pq.enqueue((n, time + t)) }
      }
      if (seen.size == n) return time
    }
    -1
  }
}
