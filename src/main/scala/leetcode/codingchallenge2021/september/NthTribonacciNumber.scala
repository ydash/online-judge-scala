package leetcode.codingchallenge2021.september

object NthTribonacciNumber {
  def tribonacci(n: Int): Int = {

    @scala.annotation.tailrec
    def aux(i: Int, a: Int, b: Int, c: Int): Int =
      if (i == n) c
      else aux(i + 1, b, c, a + b + c)

    if (n < 2) n
    else aux(2, 0, 1, 1)
  }
}
