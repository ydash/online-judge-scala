package leetcode.codingchallenge2021.august

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object SubSetsII {
  def subsetsWithDup(nums: Array[Int]): List[List[Int]] = {
    nums.sortInPlace()
    val buffer = new mutable.HashSet[List[Int]]()
    (0 until 1 << nums.length) foreach { bit =>
      val acc = new ListBuffer[Int]
      var x = 1
      nums.indices.foreach { i =>
        if ((x & bit) == x) acc += nums(i)
        x <<= 1
      }
      buffer += acc.toList
    }
    buffer.toList
  }
}
