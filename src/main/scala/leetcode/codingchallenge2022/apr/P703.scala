package leetcode.codingchallenge2022.apr

object P703

class KthLargest(k: Int, _nums: Array[Int]) {
  private val pq = collection.mutable.PriorityQueue[Int](_nums: _*)(Ordering.Int.reverse)

  def add(value: Int): Int = {
    pq.enqueue(value)
    while (pq.length > k) pq.dequeue()
    pq.head
  }
}
