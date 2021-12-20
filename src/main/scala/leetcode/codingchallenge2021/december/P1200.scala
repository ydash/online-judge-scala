package leetcode.codingchallenge2021.december

// 1200. Minimum Absolute Difference
object P1200 {
  def minimumAbsDifference(arr: Array[Int]): List[List[Int]] = {
    arr.sortInPlace()
    val (_, result) = (0 until arr.length - 1).foldLeft((Int.MaxValue, List.empty[List[Int]])) {
      case (acc @ (minDiff, pairs), i) =>
        val (a, b) = (arr(i), arr(i + 1))
        val diff = b - a
        if (diff < minDiff) (diff, List(List(a, b)))
        else if (diff == minDiff) (minDiff, List(a, b) :: pairs)
        else acc
    }
    result.reverse
  }
}
