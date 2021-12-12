package leetcode.codingchallenge2021.december

// 416. Partition Equal Subset Sum
object P416 {
  def canPartition(nums: Array[Int]): Boolean = {
    val sum = nums.sum
    if (sum % 2 != 0) false
    else {
      val target = sum / 2
      val dp = new Array[Boolean](target + 1)
      dp(0) = true
      for (i <- nums.indices; j <- (nums(i) to target).reverse) {
        dp(j) = dp(j) || dp(j - nums(i))
      }
      dp.last
    }
  }
}
