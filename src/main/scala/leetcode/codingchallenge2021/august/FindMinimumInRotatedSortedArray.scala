package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object FindMinimumInRotatedSortedArray {
  def findMin(nums: Array[Int]): Int = {
    val x = nums(0)

    @tailrec
    def binSearch(left: Int, right: Int): Int =
      if (left > right) 0
      else {
        val mid = (left + right) / 2
        if (mid > 0 && nums(mid - 1) > nums(mid)) mid
        else if (nums(mid) < x) binSearch(left, mid - 1)
        else binSearch(mid + 1, right)
      }

    nums(binSearch(0, nums.length - 1))
  }
}
