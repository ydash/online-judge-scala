package leetcode.codingchallenge2021.december

object P56 {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    val result = collection.mutable.ArrayBuffer[Array[Int]]()
    intervals.sortInPlaceBy(_(0))
    var current = intervals.head
    for (interval @ Array(s, e) <- intervals) {
      if (s <= current(1)) current = Array(current(0) min s, current(1) max e)
      else {
        result += current
        current = interval
      }
    }
    result += current
    result.toArray
  }
}
