package leetcode.codingchallenge2021.november

object LargestDivisibleSubset {
  def largestDivisibleSubset(nums: Array[Int]): List[Int] = {
    val dp = Array.fill[List[Int]](nums.length)(Nil)
    nums.sortInPlace()
    for (i <- dp.indices) {
      var longest: List[Int] = Nil
      val lim = nums(i) / 2
      var j = 0
      while (j < i && nums(j) <= lim) {
        if (nums(i) % nums(j) == 0 && dp(j).length > longest.length) longest = dp(j)
        j += 1
      }
      dp(i) = nums(i) :: longest
    }
    dp.maxBy(_.length).reverse
  }
}
