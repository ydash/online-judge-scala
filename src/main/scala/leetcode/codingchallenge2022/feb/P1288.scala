package leetcode.codingchallenge2022.feb

// 1288. Remove Covered Intervals
object P1288 {
  def removeCoveredIntervals(intervals: Array[Array[Int]]): Int = {
    intervals.sortInPlaceWith { case (Array(l1, r1), Array(l2, r2)) => if (l1 == l2) r1 > r2 else l1 < l2 }
    var count, currentR = 0
    for (Array(_, r) <- intervals if currentR < r) {
      count += 1
      currentR = r
    }
    count
  }
}
