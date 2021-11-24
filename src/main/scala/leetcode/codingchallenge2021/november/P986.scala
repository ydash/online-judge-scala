package leetcode.codingchallenge2021.november

// 986. Interval List Intersections
object P986 {
  def intervalIntersection(firstList: Array[Array[Int]], secondList: Array[Array[Int]]): Array[Array[Int]] = {
    var i = 0; var j = 0
    val result = scala.collection.mutable.ArrayBuffer[Array[Int]]()
    while (i < firstList.length && j < secondList.length) {
      val Array(si, ei) = firstList(i)
      val Array(sj, ej) = secondList(j)
      if (si <= ej && sj <= ei) result += Array(si max sj, ei min ej)
      if (ei < ej) i += 1
      else j += 1
    }
    result.toArray
  }
}
