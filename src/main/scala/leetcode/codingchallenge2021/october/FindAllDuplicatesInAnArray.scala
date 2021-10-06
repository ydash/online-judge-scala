package leetcode.codingchallenge2021.october

import scala.collection.mutable.ListBuffer

object FindAllDuplicatesInAnArray {
  def findDuplicates(nums: Array[Int]): List[Int] = {
    val buffer = ListBuffer[Int]()
    for (i <- nums.indices) {
      val j = nums(i).abs
      if (nums(j - 1) < 0) buffer += j
      else nums(j - 1) *= -1
    }
    buffer.toList
  }
}
