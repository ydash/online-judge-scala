package leetcode.codingchallenge2021.november

// 238. Product of Array Except Self
object P238 {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val result = Array.fill(nums.length)(1)
    for (i <- 1 until result.length) result(i) = result(i - 1) * nums(i - 1)
    var acc = 1
    for (i <- result.indices.reverse) {
      result(i) = result(i) * acc
      acc *= nums(i)
    }
    result
  }
}
