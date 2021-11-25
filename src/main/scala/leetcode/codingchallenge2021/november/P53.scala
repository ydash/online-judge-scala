package leetcode.codingchallenge2021.november

// 53. Maximum Subarray
object P53 {
  def maxSubArray(nums: Array[Int]): Int = {
    for (i <- 1 until nums.length if nums(i - 1) > 0) nums(i) += nums(i - 1)
    nums.max
  }
}
