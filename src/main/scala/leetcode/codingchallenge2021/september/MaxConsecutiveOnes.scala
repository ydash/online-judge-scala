package leetcode.codingchallenge2021.september

object MaxConsecutiveOnes {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int =
    nums
      .foldLeft(0 -> 0) {
        case ((acc, max), 1) => (acc + 1, max max acc + 1)
        case ((_, max), _)   => (0, max)
      }
      ._2
}
