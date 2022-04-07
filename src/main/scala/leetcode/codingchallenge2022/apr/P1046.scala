package leetcode.codingchallenge2022.apr

// 1046. Last Stone Weight
object P1046 {
  def lastStoneWeight(stones: Array[Int]): Int = {
    val pq = collection.mutable.PriorityQueue[Int]()
    pq.enqueue(stones: _*)
    while (pq.length > 1) pq.enqueue(pq.dequeue() - pq.dequeue())
    pq.headOption.getOrElse(0)
  }
}
