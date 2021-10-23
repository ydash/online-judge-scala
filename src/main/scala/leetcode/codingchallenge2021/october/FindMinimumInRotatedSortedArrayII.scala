package leetcode.codingchallenge2021.october

object FindMinimumInRotatedSortedArrayII {
  def findMin(nums: Array[Int]): Int = {

    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int =
      if (left >= right) left
      else {
        val mid = (left + right) / 2
        if (nums(mid) > nums(right)) binSearch(mid + 1, right)
        else if (nums(mid) < nums(right)) binSearch(left, mid)
        else binSearch(left, right - 1)
      }

    nums(binSearch(0, nums.length - 1))
  }

}
