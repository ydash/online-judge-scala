package leetcode.codingchallenge2022.feb

// 136. Single Number
object P136 {
  def singleNumber(nums: Array[Int]): Int = nums.foldLeft(0) { (acc, n) => acc ^ n }
}
