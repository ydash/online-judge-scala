package leetcode.codingchallenge2022.mar

// 740. Delete and Earn
object P740 {
  def deleteAndEarn(nums: Array[Int]): Int = {
    val sum = new Array[Int](nums.max + 1)
    for (n <- nums) sum(n) += n
    var current, prev, prevPrev = 0
    for (i <- sum.indices) {
      current = prevPrev + sum(i)
      prevPrev = prevPrev max prev
      prev = current
    }
    current max prevPrev
  }
}
