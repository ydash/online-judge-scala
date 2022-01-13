package leetcode.codingchallenge2022.jan

// 452. Minimum Number of Arrows to Burst Balloons
object P452 {
  def findMinArrowShots(points: Array[Array[Int]]): Int = {
    points.sortInPlaceBy(_(1))
    var count = 1
    var p = points.head(1)
    for (Array(s, e) <- points if s > p) {
      count += 1
      p = e
    }
    count
  }
}
