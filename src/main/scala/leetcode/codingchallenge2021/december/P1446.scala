package leetcode.codingchallenge2021.december

import scala.util.chaining.scalaUtilChainingOps

// 1446. Consecutive Characters
object P1446 {
  def maxPower(s: String): Int = s
    .drop(1)
    .foldLeft(((s.head, 1), 0)) { case (((prev, count), tmpMax), current) =>
      if (prev == current) ((current, count + 1), tmpMax)
      else ((current, 1), tmpMax max count)
    }
    .pipe { case ((_, count), tmpMax) => count max tmpMax }
}
