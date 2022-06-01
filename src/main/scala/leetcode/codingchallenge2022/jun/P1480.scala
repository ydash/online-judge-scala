package leetcode.codingchallenge2022.jun

// 1480. Running Sum of 1d Array
object P1480 {
  def runningSum(nums: Array[Int]): Array[Int] = {
    for (i <- 1 until nums.length) nums(i) += nums(i - 1)
    nums
  }
}
