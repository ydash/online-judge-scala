package leetcode.codingchallenge2022.feb

// 169. Majority Element
object P169 {
  def majorityElement(nums: Array[Int]): Int = {
    var majority, count = 0
    for (n <- nums) {
      if (count <= 0) majority = n
      count += (if (n == majority) 1 else -1)
    }
    majority
  }
}
