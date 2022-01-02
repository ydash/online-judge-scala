package leetcode.codingchallenge2022.jan

// 312. Burst Balloons
object P312 {

  def maxCoins(nums: Array[Int]): Int = {
    val n = nums.length
    val cache = Array.ofDim[Int](n + 2, n + 2)
    val ns = Array.fill[Int](n + 2)(1)
    for (i <- 1 until n + 1) ns(i) = nums(i - 1)
    def maxCoins(nums: Array[Int], left: Int, right: Int): Int = {
      if (left + 1 >= right) 0
      else if (cache(left)(right) != 0) cache(left)(right)
      else {
        var coins = 0
        for (i <- left + 1 until right) {
          coins = coins max (maxCoins(nums, left, i) + nums(left) * nums(i) * nums(right) + maxCoins(nums, i, right))
        }
        cache(left)(right) = coins
        coins
      }
    }
    maxCoins(ns, 0, n + 1)
  }

}
