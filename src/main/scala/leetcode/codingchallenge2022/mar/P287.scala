package leetcode.codingchallenge2022.mar

// 287. Find the Duplicate Number
object P287 {
  def findDuplicate(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int = {
      if (left >= right) left
      else {
        val mid = (left + right) / 2
        val count = nums.count(_ <= mid)
        if (count > mid) binSearch(left, mid)
        else binSearch(mid + 1, right)
      }
    }
    binSearch(1, nums.length - 1)
  }
}
