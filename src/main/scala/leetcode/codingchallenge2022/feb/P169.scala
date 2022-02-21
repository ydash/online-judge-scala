package leetcode.codingchallenge2022.feb

// 169. Majority Element
object P169 {
  def majorityElement(nums: Array[Int]): Int = {
    nums.sortInPlace()
    nums(nums.length / 2)
  }
}
