package leetcode.codingchallenge2022.apr

// 31. Next Permutation
object P31 {
  def nextPermutation(nums: Array[Int]): Unit = {
    nums.indices
      .findLast(i => i > 0 && nums(i - 1) < nums(i))
      .fold[Unit] {
        reverse(nums, 0, nums.length - 1)
      } { i =>
        nums.indices.findLast(nums(_) > nums(i - 1)).foreach { j =>
          val tmp = nums(j)
          nums(j) = nums(i - 1)
          nums(i - 1) = tmp
        }
        reverse(nums, i, nums.length - 1)
      }
  }

  private def reverse(nums: Array[Int], from: Int, to: Int): Unit = {
    var l = from
    var r = to
    while (l < r) {
      val tmp = nums(l)
      nums(l) = nums(r)
      nums(r) = tmp
      l += 1
      r -= 1
    }
  }
}
