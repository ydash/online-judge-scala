package leetcode.codingchallenge2021.december

// 973. K Closest Points to Origin
object P973 {
  def kClosest(points: Array[Array[Int]], k: Int): Array[Array[Int]] = {
    points.sortInPlaceBy { case Array(x, y) => x * x + y * y }
    points.take(k)
  }
}
