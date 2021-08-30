package leetcode.codingchallenge2021.august

import scala.util.chaining.scalaUtilChainingOps

object RangeAdditionII {
  def maxCount(m: Int, n: Int, ops: Array[Array[Int]]): Int =
    ops
      .foldLeft(m -> n) { case ((minM, minN), Array(a, b)) => (minM min a) -> (minN min b) }
      .pipe(it => it._1 * it._2)
}
