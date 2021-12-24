package leetcode.codingchallenge2021.december

// 56. Merge Intervals
object P56 {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] =
    intervals
      .sortBy(_(0))
      .foldLeft(List[Array[Int]]()) { case (acc, interval @ Array(s1, e1)) =>
        acc match {
          case Nil                               => interval :: acc
          case Array(s2, e2) :: tail if s1 <= e2 => Array(s1 min s2, e1 max e2) :: tail
          case _                                 => interval :: acc
        }
      }
      .reverse
      .toArray
}
