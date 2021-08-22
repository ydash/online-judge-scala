package leetcode.codingchallenge2021.august

import scala.collection.mutable

object RemoveBoxes {
  type DP = mutable.HashMap[(Int, Int, Int), Int]

  def removeBoxes(boxes: Array[Int]): Int = {
    val n = boxes.length
    val dp = new DP()
    removeBoxes(boxes, 0, n - 1, 0, dp)
  }

  def removeBoxes(
      boxes: Array[Int],
      start: Int,
      end: Int,
      count: Int,
      dp: DP
  ): Int = {
    if (start > end) 0
    else
      dp.getOrElseUpdate(
        (start, end, count), {
          var i = start
          var k = count
          while (i + 1 <= end && boxes(i + 1) == boxes(i)) {
            i += 1
            k += 1
          }
          val point = (k + 1) * (k + 1) + removeBoxes(boxes, i + 1, end, 0, dp)
          val max =
            (i + 1 to end).filter(boxes(i) == boxes(_)).foldLeft(point) { (acc, m) =>
              acc max removeBoxes(boxes, i + 1, m - 1, 0, dp) + removeBoxes(boxes, m, end, k + 1, dp)
            }
          max
        }
      )
  }
}
