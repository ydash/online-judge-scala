package leetcode.codingchallenge2021.november

// 1413. Minimum Value to Get Positive Step by Step Sum
object MinimumValueToGetPositiveStepByStepSum {
  def minStartValue(nums: Array[Int]): Int = nums
    .foldLeft((0, 0)) { case ((prev, min), n) =>
      val current = prev + n
      (current, current min min)
    }
    ._2
    .abs + 1
}
