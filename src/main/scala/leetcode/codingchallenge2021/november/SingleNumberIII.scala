package leetcode.codingchallenge2021.november

// 260. Single Number III
object SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    var diff = 0
    for (n <- nums) diff ^= n
    diff &= -diff

    val result = Array(0, 0)
    for (n <- nums) {
      if ((n & diff) == 0) result(0) ^= n
      else result(1) ^= n
    }
    result
  }
}
