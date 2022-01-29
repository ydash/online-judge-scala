package leetcode.codingchallenge2022.jan

object P84 {
  def largestRectangleArea(height: Array[Int]): Int = {
    var stack = List(-1)
    var result = 0
    for (i <- height.indices) {
      while (stack.head != -1 && height(i) < height(stack.head)) {
        val h = height(stack.head)
        stack = stack.tail
        val w = i - stack.head - 1
        result = result max (h * w)
      }
      stack = i :: stack
    }
    while (stack.head != -1) {
      val h = height(stack.head)
      stack = stack.tail
      val w = height.length - stack.head - 1
      result = result max (h * w)
    }
    result
  }
}
