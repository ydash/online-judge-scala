package leetcode.codingchallenge2021.october

object JumpGame {
  def canJump(nums: Array[Int]): Boolean = {
    var achieve = 0
    for (i <- nums.indices if i <= achieve) {
      achieve = achieve max (i + nums(i))
    }
    achieve >= nums.length - 1
  }
}
