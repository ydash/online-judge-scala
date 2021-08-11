package leetcode.codingchallenge2021.august

import scala.collection.mutable
import scala.util.chaining.scalaUtilChainingOps

object ArrayOfDoubledPairs {
  def canReorderDoubled(arr: Array[Int]): Boolean = {
    val (neg, pos) = arr.partition(_ < 0).pipe { case (n, p) => n.sortBy(-_) -> p.sorted }
    isDoubled(neg) && isDoubled(pos)
  }

  private def isDoubled(arr: Array[Int]): Boolean = {
    val tmp = new mutable.HashMap[Int, Int]().withDefaultValue(0)
    arr.foreach { x =>
      val y = x / 2
      if (x % 2 == 0 && tmp(y) > 0) {
        tmp(y) -= 1
        if (tmp(y) == 0) tmp.remove(y)
      }
      else tmp(x) += 1
    }
    tmp.isEmpty
  }
}
