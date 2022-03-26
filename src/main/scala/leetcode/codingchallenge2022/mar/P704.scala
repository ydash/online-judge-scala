package leetcode.codingchallenge2022.mar

// 704. Binary Search
object P704 {
  def search(nums: Array[Int], target: Int): Int = {
    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int =
      if (left > right) -1
      else {
        val mid = (left + right) / 2
        if (nums(mid) < target) binSearch(mid + 1, right)
        else if (nums(mid) > target) binSearch(left, mid - 1)
        else mid
      }
    binSearch(0, nums.length - 1)
  }
}
