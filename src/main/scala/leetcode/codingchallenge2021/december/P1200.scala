package leetcode.codingchallenge2021.december

// 1200. Minimum Absolute Difference
object P1200 {
  def minimumAbsDifference(arr: Array[Int]): List[List[Int]] = {
    var minDiff = Int.MaxValue
    var result: List[List[Int]] = Nil
    arr.sortInPlace()
    for (i <- arr.indices.drop(1)) {
      val (a, b) = (arr(i - 1), arr(i))
      val diff = b - a
      if (diff == minDiff) result = List(a, b) :: result
      else if (diff < minDiff) {
        minDiff = diff
        result = List(List(a, b))
      }
    }
    result.reverse
  }
}
