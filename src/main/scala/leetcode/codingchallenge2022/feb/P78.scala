package leetcode.codingchallenge2022.feb

// Subsets
object P78 {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    val lim = Math.pow(2, nums.length).toInt
    var result: List[List[Int]] = Nil
    for (bit <- 0 until lim) {
      var lst: List[Int] = Nil
      var b = 1
      for (n <- nums) {
        if ((bit & b) != 0) lst = n :: lst
        b <<= 1
      }
      result = lst :: result
    }
    result
  }
}
