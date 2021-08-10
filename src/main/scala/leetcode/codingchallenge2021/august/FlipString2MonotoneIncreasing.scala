package leetcode.codingchallenge2021.august

import scala.util.chaining.scalaUtilChainingOps

object FlipString2MonotoneIncreasing {
  def minFlipsMonoIncr(s: String): Int = s.foldLeft(0 -> 0) { case ((zeroCount, oneCount), bit) =>
    val b: Int = bit - 48
    zeroCount + b -> ((zeroCount min oneCount) + 1 - b)
  }.pipe { case (z, o) => z min o }
}
