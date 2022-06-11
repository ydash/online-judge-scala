package leetcode.codingchallenge2022.jun

// 1658. Minimum Operations to Reduce X to Zero
object P1658 {
  def minOperations(nums: Array[Int], x: Int): Int = {
    var i = 0
    var rest = nums.sum - x
    var maxLen = -1
    for (j <- nums.indices) {
      rest -= nums(j)
      while (i <= j && rest < 0) {
        rest += nums(i)
        i += 1
      }
      if (rest == 0) maxLen = maxLen max (j - i + 1)
    }
    if (maxLen < 0) -1 else nums.length - maxLen
  }
}
