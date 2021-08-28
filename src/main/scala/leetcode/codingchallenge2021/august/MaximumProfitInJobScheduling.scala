package leetcode.codingchallenge2021.august

import scala.collection.immutable.SortedMap
import scala.util.chaining.scalaUtilChainingOps

object MaximumProfitInJobScheduling {
  def jobScheduling(startTime: Array[Int], endTime: Array[Int], profit: Array[Int]): Int = {
    endTime.indices
      .sortBy(endTime(_))
      .foldLeft(SortedMap(0 -> 0)) { (dp, i) =>
        dp.updated(
          endTime(i),
          dp.maxBefore(startTime(i) + 1).get._2 + profit(i) max dp.maxBefore(endTime(i) + 1).get._2
        )
      }
      .pipe(_.last._2)
  }
}
