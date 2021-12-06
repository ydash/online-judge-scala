package leetcode.codingchallenge2021.december

// 1217. Minimum Cost to Move Chips to The Same Position
object P1217 {
  def minCostToMoveChips(position: Array[Int]): Int = {
    val (e, o) = position.foldLeft((0, 0)) { case ((even, odd), p) =>
      if (p % 2 == 0) (even + 1, odd)
      else (even, odd + 1)
    }
    e min o
  }
}
