package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object SumOfSquareNumbers {
  def judgeSquareSum(c: Int): Boolean = {
    @tailrec
    def judge(a: Int, b: Int): Boolean =
      if (a > b) false
      else {
        val x = a * a + b * b
        if (x == c) true
        else if (x < c) judge(a + 1, b)
        else judge(a, b - 1)
      }

    judge(0, Math.sqrt(c).floor.toInt)
  }
}
