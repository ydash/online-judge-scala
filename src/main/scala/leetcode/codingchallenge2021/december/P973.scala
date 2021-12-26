package leetcode.codingchallenge2021.december

// 973. K Closest Points to Origin
object P973 {
  def kClosest(points: Array[Array[Int]], k: Int): Array[Array[Int]] = {
    @scala.annotation.tailrec
    def loop(l: Int, r: Int): Unit = {
      if (l <= r) {
        val m = partition(points, l, r)
        if (m < k) loop(m + 1, r)
        else if (m > k) loop(l, m - 1)
      }
    }
    loop(0, points.length - 1)
    points.take(k)
  }

  private def partition(arr: Array[Array[Int]], left: Int, right: Int): Int = {
    val pivot = arr(left)
    var (l, r) = (left, right)
    while (l < r) {
      while (l < r && dist(pivot) <= dist(arr(r))) r -= 1
      arr(l) = arr(r)
      while (l < r && dist(arr(l)) <= dist(pivot)) l += 1
      arr(r) = arr(l)
    }
    arr(l) = pivot
    l
  }

  private def dist(p: Array[Int]): Int = p(0) * p(0) + p(1) * p(1)
}
