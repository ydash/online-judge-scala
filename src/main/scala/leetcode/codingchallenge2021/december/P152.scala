package leetcode.codingchallenge2021.december

// 152. Maximum Product Subarray
object P152 {
  def maxProduct(nums: Array[Int]): Int = {
    var answer, max, min = nums.head
    for (n <- nums.drop(1)) {
      val a = n * max
      val b = n * min
      max = a max b max n
      min = a min b min n
      answer = answer max max
    }
    answer
  }
}
