package leetcode.codingchallenge2021.october

import scala.collection.mutable.ArrayBuffer

object FindMinimumInRotatedSortedArrayII {
  def findMin(nums: Array[Int]): Int = {
    var seen = Set[Int]()
    val uniqNums = ArrayBuffer[Int]()

    for (n <- nums if !seen(n)) {
      seen += n
      uniqNums += n
    }

    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int =
      if (left >= right) left
      else {
        val mid = (left + right) / 2
        if (uniqNums(mid) > uniqNums(right)) binSearch(mid + 1, right)
        else binSearch(left, mid)
      }

    uniqNums(binSearch(0, uniqNums.length - 1))
  }

}
