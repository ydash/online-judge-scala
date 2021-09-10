package leetcode.codingchallenge2021.september

import scala.collection.mutable

object ArithmeticSlicesII {
  def numberOfArithmeticSlices(nums: Array[Int]): Int = {
    var count = 0
    val dp = Array.fill(nums.length)(mutable.Map[Int, Int]())

    for {
      i <- nums.indices
      j <- 0 until i
      if nums(i).toLong - nums(j) == nums(i) - nums(j)
    } {
      val diff = nums(i) - nums(j)
      val c1 = dp(i).getOrElse(diff, 0)
      val c2 = dp(j).getOrElse(diff, 0)
      count += c2
      dp(i) += diff -> (c1 + c2 + 1)
    }

    count
  }
}
