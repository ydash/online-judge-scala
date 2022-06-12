package leetcode.codingchallenge2022.jun

// 1695. Maximum Erasure Value
object P1695 {
  def maximumUniqueSubarray(nums: Array[Int]): Int = {
    val subarray = collection.mutable.Set[Int]()
    var left, maxScore, currentScore = 0
    for (right <- nums.indices) {
      if (subarray.contains(nums(right))) {
        val i = nums.indexOf(nums(right), left)
        while (left <= i) {
          currentScore -= nums(left)
          subarray -= nums(left)
          left += 1
        }
      }
      currentScore += nums(right)
      subarray += nums(right)
      maxScore = maxScore max currentScore
    }
    maxScore
  }
}
