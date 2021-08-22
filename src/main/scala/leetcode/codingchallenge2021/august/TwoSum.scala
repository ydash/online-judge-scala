package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val sortedIndices = nums.indices.sortBy(i => nums(i))

    @tailrec
    def loop(i: Int, j: Int): Array[Int] =
      nums(sortedIndices(i)) + nums(sortedIndices(j)) match {
        case x if x < target => loop(i + 1, j)
        case x if x > target => loop(i, j - 1)
        case _               => Array(sortedIndices(i), sortedIndices(j))
      }

    loop(0, nums.length - 1)
  }
}
