package leetcode.codingchallenge2022.jun

object P1354 {
  def isPossible(target: Array[Int]): Boolean = {
    val pq = collection.mutable.PriorityQueue[Int]()
    var sum: Long = 0
    for (n <- target) {
      pq += n
      sum += n
    }
    while (pq.head != 1) {
      val x = pq.dequeue()
      sum -= x
      if (sum == 1) return true
      if (x < sum || sum == 0 || x % sum == 0) return false
      val y = x % sum
      sum += y
      pq += y.toInt
    }
    true
  }
}
