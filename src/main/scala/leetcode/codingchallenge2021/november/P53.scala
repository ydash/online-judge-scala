package leetcode.codingchallenge2021.november

// 53. Maximum Subarray
object P53 {
  def maxSubArray(nums: Array[Int]): Int = nums
    .foldLeft((0, Int.MinValue)) { case ((acc, max), n) =>
      val sum = acc + n
      (if (sum > 0) sum else 0, max max sum)
    }
    ._2
}
