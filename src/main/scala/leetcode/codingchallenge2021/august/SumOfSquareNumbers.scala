package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object SumOfSquareNumbers {
  def judgeSquareSum(c: Int): Boolean = {
    @tailrec
    def judge(a: Int): Boolean =
      if (a < 0) false
      else {
        val rest = c - a * a
        val b = Math.sqrt(rest).toInt
        if (rest == b * b) true
        else judge(a - 1)
      }

    judge(Math.sqrt(c).floor.toInt)
  }
}
