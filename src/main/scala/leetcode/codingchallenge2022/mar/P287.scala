package leetcode.codingchallenge2022.mar

// 287. Find the Duplicate Number
object P287 {
  def findDuplicate(nums: Array[Int]): Int = {
    var slow, fast = nums.head
    do {
      slow = nums(slow)
      fast = nums(nums(fast))
    } while (slow != fast)
    slow = nums.head
    while (slow != fast) {
      slow = nums(slow)
      fast = nums(fast)
    }
    slow
  }
}
