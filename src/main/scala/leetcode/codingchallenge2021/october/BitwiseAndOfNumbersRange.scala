package leetcode.codingchallenge2021.october

object BitwiseAndOfNumbersRange {
  def rangeBitwiseAnd(left: Int, right: Int): Int = {
    @scala.annotation.tailrec
    def aux(l: Int, r: Int, i: Int): Int =
      if (l == r) l << i
      else aux(l >> 1, r >> 1, i + 1)

    aux(left, right, 0)
  }
}
