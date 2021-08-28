package leetcode.codingchallenge2021.august

import scala.annotation.tailrec

object MaximumProfitInJobScheduling {
  def jobScheduling(startTime: Array[Int], endTime: Array[Int], profit: Array[Int]): Int = {
    val dp = new Array[Int](endTime.max + 1)

    @tailrec
    def loop(current: Int, indices: Seq[Int]): Int =
      indices match {
        case Nil => dp(current)
        case i +: tail =>
          for (j <- current + 1 until endTime(i)) dp(j) = dp(j - 1)
          dp(endTime(i)) = dp(startTime(i)) + profit(i) max dp(endTime(i)) max dp(endTime(i) - 1)
          loop(endTime(i), tail)
      }

    loop(1, endTime.indices.sortBy(endTime(_)))
  }
}
