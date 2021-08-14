package leetcode.codingchallenge2021.august

import scala.collection.mutable

object RemoveBoxes {
  type DP = mutable.HashMap[(Int, Int, Int), Int]

  def removeBoxes(boxes: Array[Int]): Int = {
    val n = boxes.length
    val dp = new DP()
    removeBoxes(boxes, 0, n - 1, 0, dp)
  }

  def removeBoxes(boxes: Array[Int], i: Int, j: Int, k: Int, dp: DP): Int = {
    if (i > j) 0
    else dp.getOrElseUpdate((i, j, k), {
      var p = i
      var count = k
      while (p + 1 <= j && boxes(p + 1) == boxes(p)) {
        p += 1
        count += 1
      }
      val point = (count + 1) * (count + 1) + removeBoxes(boxes, p + 1, j, 0, dp)
      val max = (p + 1 to j).filter(boxes(p) == boxes(_)).foldLeft(point) { (acc, m) =>
        acc max removeBoxes(boxes, p + 1, m - 1, 0, dp) + removeBoxes(boxes, m, j, count + 1, dp)
      }
      max
    })
  }
}
