package leetcode.codingchallenge2021.november

object SingleElementInSortedArray {
  def singleNonDuplicate(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def binarySearch(l: Int, r: Int): Int = {
      if (l >= r) nums(2 * l)
      else {
        val mid = (l + r) / 2
        if (nums(2 * mid) == nums(2 * mid + 1)) binarySearch(mid + 1, r)
        else binarySearch(l, r - 1)
      }
    }
    binarySearch(0, nums.length / 2)
  }
}
