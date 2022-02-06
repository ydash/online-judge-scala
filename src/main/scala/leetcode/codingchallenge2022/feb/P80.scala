package leetcode.codingchallenge2022.feb

// 80. Remove Duplicates from Sorted Array II
object P80 {
  def removeDuplicates(nums: Array[Int]): Int = {
    var k = 0
    for (i <- nums.indices if k < 2 || nums(k - 2) < nums(i)) {
      nums(k) = nums(i)
      k += 1
    }
    k
  }
}
