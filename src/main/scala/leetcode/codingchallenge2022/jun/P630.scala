package leetcode.codingchallenge2022.jun

// 630. Course Schedule III
object P630 {
  def scheduleCourse(courses: Array[Array[Int]]): Int = {
    val pq = collection.mutable.PriorityQueue[Int]()
    courses.sortInPlaceBy(_(1))
    var total = 0
    for (Array(duration, lastDay) <- courses) {
      total += duration
      pq += duration
      if (total > lastDay) total -= pq.dequeue()
    }
    pq.length
  }
}
