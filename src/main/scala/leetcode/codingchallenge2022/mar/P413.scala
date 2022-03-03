package leetcode.codingchallenge2022.mar

// 413. Arithmetic Slices
object P413 {
  def numberOfArithmeticSlices(nums: Array[Int]): Int =
    if (nums.length < 3) 0
    else {
      @scala.annotation.tailrec
      def loop(i: Int, currentLength: Int, diff: Int, acc: Int): Int = {
        if (i >= nums.length) acc
        else {
          if (nums(i) - nums(i - 1) == diff) loop(i + 1, currentLength + 1, diff, acc + currentLength - 1)
          else loop(i + 1, 2, nums(i) - nums(i - 1), acc)
        }
      }
      loop(2, 2, nums(1) - nums(0), 0)
    }
}
