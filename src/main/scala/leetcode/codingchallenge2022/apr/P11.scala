package leetcode.codingchallenge2022.apr

// 11. Container With Most Water
object P11 {
  def maxArea(height: Array[Int]): Int = {
    @scala.annotation.tailrec
    def loop(left: Int, right: Int, acc: Int = 0): Int = {
      if (left >= right) acc
      else {
        val volume = (right - left) * (height(left) min height(right))
        if (height(left) < height(right)) loop(left + 1, right, acc max volume)
        else loop(left, right - 1, acc max volume)
      }
    }
    loop(0, height.length - 1)
  }
}
