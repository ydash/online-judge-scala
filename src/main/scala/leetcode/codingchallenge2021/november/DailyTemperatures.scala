package leetcode.codingchallenge2021.november

object DailyTemperatures {
  def dailyTemperatures(temperatures: Array[Int]): Array[Int] = {
    val answer = new Array[Int](temperatures.length)
    var stack = List[Int](0)
    for (i <- 1 until temperatures.length) {
      while (stack.nonEmpty && temperatures(stack.head) < temperatures(i)) {
        answer(stack.head) = i - stack.head
        stack = stack.tail
      }
      stack = i :: stack
    }
    answer
  }
}
