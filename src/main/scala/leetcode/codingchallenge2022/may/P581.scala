package leetcode.codingchallenge2022.may

// 581. Shortest Unsorted Continuous Subarray
object P581 {
  def findUnsortedSubarray(nums: Array[Int]): Int = {
    val sorted = nums.sorted
    val start = nums.indices.find(i => nums(i) != sorted(i))
    val end = nums.indices.findLast(j => nums(j) != sorted(j))
    start.flatMap(i => end.map(j => j - i + 1)).getOrElse(0)
  }
}
