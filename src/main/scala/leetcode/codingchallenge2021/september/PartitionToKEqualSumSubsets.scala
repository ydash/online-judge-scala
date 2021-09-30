package leetcode.codingchallenge2021.september

import scala.collection.mutable.ArrayBuffer

object PartitionToKEqualSumSubsets {
  def canPartitionKSubsets(nums: Array[Int], k: Int): Boolean = {
    val sum = nums.sum
    val subsetSum = sum / k
    if (sum % k != 0 || nums.exists(_ > subsetSum)) false
    else {
      loop(nums.toList.sortBy(-_), subsetSum, k, ArrayBuffer())
    }
  }

  private def loop(nums: List[Int], sum: Int, k: Int, acc: ArrayBuffer[Int]): Boolean = nums match {
    case Nil => true
    case h :: t =>
      for (i <- acc.indices if acc(i) + h <= sum) {
        acc(i) += h
        if (loop(t, sum, k, acc)) return true
        acc(i) -= h
      }
      if (acc.length < k) {
        acc += h
        if (loop(t, sum, k, acc)) return true
        acc.remove(acc.length - 1)
      }
      false
  }
}
