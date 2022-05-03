package leetcode.codingchallenge2022.may

// 581. Shortest Unsorted Continuous Subarray
object P581 {
  def findUnsortedSubarray(nums: Array[Int]): Int = {
    val n = nums.length
    @scala.annotation.tailrec
    def loop(i: Int, start: Int, end: Int, maxFromLeft: Int, minFromRight: Int): Int = {
      if (i >= n) end - start + 1
      else {
        val max = maxFromLeft max nums(i)
        val min = minFromRight min nums(n - i - 1)
        loop(i + 1, if (nums(n - i - 1) > min) n - i - 1 else start, if (nums(i) < max) i else end, max, min)
      }
    }
    loop(0, -1, -2, nums.head, nums.last)
  }
}
