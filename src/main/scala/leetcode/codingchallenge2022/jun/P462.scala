package leetcode.codingchallenge2022.jun

// 462. Minimum Moves to Equal Array Elements II
object P462 {
  def minMoves2(nums: Array[Int]): Int = {
    nums.sortInPlace()
    val mid = nums(nums.length / 2)
    nums.map(n => (n - mid).abs).sum
  }
}
