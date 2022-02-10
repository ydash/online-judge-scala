package leetcode.codingchallenge2022.feb

// 560. Subarray Sum Equals K
object P560 {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    var result = 0
    val prefix = collection.mutable.Map[Int, Int](0 -> 1).withDefaultValue(0)
    var sum = 0
    for (n <- nums) {
      sum += n
      result += prefix(sum - k)
      prefix(sum) += 1
    }
    result
  }
}
