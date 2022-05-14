package leetcode.codingchallenge2022.may

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

// 47. Permutations II
object P47 {
  def permuteUnique(nums: Array[Int]): List[List[Int]] = {
    val count = mutable.Map[Int, Int]().withDefaultValue(0)
    for (n <- nums) count(n) += 1
    val buffer = ListBuffer[List[Int]]()
    def backtrack(acc: List[Int]): Unit =
      if (acc.length == nums.length) buffer += acc
      else {
        for (n <- count.keys if count(n) > 0) {
          count(n) -= 1
          backtrack(n :: acc)
          count(n) += 1
        }
      }
    backtrack(Nil)
    buffer.toList
  }
}
