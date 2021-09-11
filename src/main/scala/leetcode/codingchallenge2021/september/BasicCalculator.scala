package leetcode.codingchallenge2021.september

import scala.collection.mutable

object BasicCalculator {
  def calculate(s: String): Int = {
    var acc = 0
    var sign = 1
    var num = 0
    val stack = mutable.Stack[(Int, Int)]()

    for (c <- s) {
      c match {
        case d if ('0' to '9') contains d =>
          num = num * 10 + d.asDigit
        case '(' =>
          stack.push(acc -> sign)
          acc = 0
          sign = 1
        case ')' =>
          val (a, s) = stack.pop()
          acc = a + s * (acc + sign * num)
          sign = 1
          num = 0
        case '+' | '-' =>
          acc += sign * num
          sign = if (c == '-') -1 else 1
          num = 0
        case _ => ()
      }
    }

    acc + sign * num
  }

}
