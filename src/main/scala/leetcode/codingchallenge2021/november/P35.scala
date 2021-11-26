package leetcode.codingchallenge2021.november

// 35. Search Insert Position
object P35 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    @scala.annotation.tailrec
    def binarySearch(left: Int, right: Int): Int =
      if (left > right) left
      else {
        val m = (left + right) / 2
        if (nums(m) == target) m
        else if (nums(m) > target) binarySearch(left, m - 1)
        else binarySearch(m + 1, right)
      }

    binarySearch(0, nums.length - 1)
  }
}
