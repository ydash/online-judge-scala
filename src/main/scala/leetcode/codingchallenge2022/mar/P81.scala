package leetcode.codingchallenge2022.mar

// 81. Search in Rotated Sorted Array II
object P81 {
  def search(nums: Array[Int], target: Int): Boolean = {
    @scala.annotation.tailrec
    def findPivot(left: Int, right: Int): Option[Int] =
      if (left > right) {
        if (left >= nums.length) None
        else Option(left)
      } else {
        val mid = (left + right) / 2
        if (nums.head <= nums(mid)) findPivot(mid + 1, right)
        else findPivot(left, mid - 1)
      }

    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Boolean = {
      if (left > right) false
      else {
        val mid = (left + right) / 2
        if (nums(mid) < target) binSearch(mid + 1, right)
        else if (nums(mid) > target) binSearch(left, mid - 1)
        else true
      }
    }

    findPivot(0, nums.lastIndexWhere(_ != nums.head))
      .fold(binSearch(0, nums.length - 1))(p => binSearch(0, p - 1) || binSearch(p, nums.length - 1))
  }
}
