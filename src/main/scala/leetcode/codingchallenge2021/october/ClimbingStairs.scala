package leetcode.codingchallenge2021.october

object ClimbingStairs {
  def climbStairs(n: Int): Int = {
    @scala.annotation.tailrec
    def aux(i: Int, a: Int, b: Int): Int =
      if (i == n) a
      else aux(i + 1, b, a + b)
    aux(0, 1, 1)
  }
}
