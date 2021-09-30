package leetcode.codingchallenge2021.september

object PartitionToKEqualSumSubsets {
  def canPartitionKSubsets(nums: Array[Int], k: Int): Boolean = {
    val sum = nums.sum
    val subsetSum = sum / k
    if (sum % k != 0 || nums.exists(_ > subsetSum)) false
    else {
      backtracking(nums.toList, subsetSum, new Array(k))
    }
  }

  private def backtracking(nums: List[Int], sum: Int, acc: Array[Int]): Boolean = nums match {
    case Nil => acc.forall(_ == sum)
    case h :: t =>
      for (i <- acc.indices) {
        val s = acc(i)
        if (s + h <= sum) {
          acc(i) = s + h
          if (backtracking(t, sum, acc)) return true
          acc(i) = s
        }
      }
      false
  }
}
