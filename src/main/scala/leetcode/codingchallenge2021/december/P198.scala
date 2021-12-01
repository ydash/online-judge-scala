package leetcode.codingchallenge2021.december

// 198. House Robber
object P198 {
  def rob(nums: Array[Int]): Int = {
    for (i <- 2 until nums.length) {
      nums(i) += nums(i - 2)
      nums(i - 1) = nums(i - 1) max nums(i - 2)
    }
    nums.takeRight(2).max
  }
}
