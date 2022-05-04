package leetcode.codingchallenge2022.may

// 1679. Max Number of K-Sum Pairs
object P1679 {
  def maxOperations(nums: Array[Int], k: Int): Int = {
    var l = 0
    var r = nums.length - 1
    var count = 0
    nums.sortInPlace()
    while (l < r) {
      if (nums(l) + nums(r) == k) {
        count += 1
        l += 1
        r -= 1
      } else if (nums(l) + nums(r) < k) l += 1
      else r -= 1
    }
    count
  }
}
