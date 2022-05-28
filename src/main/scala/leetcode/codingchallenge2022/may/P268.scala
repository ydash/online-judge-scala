package leetcode.codingchallenge2022.may

object P268 {
  def missingNumber(nums: Array[Int]): Int = {
    val n = nums.length
    (n + n * n) / 2 - nums.sum
  }
}
