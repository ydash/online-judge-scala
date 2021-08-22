package leetcode.codingchallenge2021.august

import scala.collection.mutable

object ArrayOfDoubledPairs {
  def canReorderDoubled(arr: Array[Int]): Boolean = isDoubled(arr.sortBy(_.abs))

  private def isDoubled(arr: Array[Int]): Boolean = {
    val tmp = new mutable.HashMap[Int, Int]().withDefaultValue(0)
    arr.foreach { x =>
      val y = x / 2
      if (x % 2 == 0 && tmp(y) > 0) {
        tmp(y) -= 1
        if (tmp(y) == 0) tmp.remove(y)
      } else tmp(x) += 1
    }
    tmp.isEmpty
  }
}
