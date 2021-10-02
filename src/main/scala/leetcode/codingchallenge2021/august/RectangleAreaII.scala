package leetcode.codingchallenge2021.august

import scala.collection.mutable

object RectangleAreaII {
  def rectangleArea(rectangles: Array[Array[Int]]): Int = {
    val xs = new mutable.HashSet[Int]()
    val ys = new mutable.HashSet[Int]()
    for (Array(x1, y1, x2, y2) <- rectangles) {
      xs += (x1, x2)
      ys += (y1, y2)
    }

    val imapX = xs.toArray.sorted
    val imapY = ys.toArray.sorted
    val mapX = new mutable.HashMap[Int, Int]()
    val mapY = new mutable.HashMap[Int, Int]()
    for (i <- imapX.indices) mapX += imapX(i) -> i
    for (i <- imapY.indices) mapY += imapY(i) -> i

    val grid = Array.ofDim[Boolean](imapX.length, imapY.length)
    for (Array(x1, y1, x2, y2) <- rectangles) {
      for (x <- mapX(x1) until mapX(x2)) {
        for (y <- mapY(y1) until mapY(y2)) grid(x)(y) = true
      }
    }
    var ans = 0L
    for (x <- grid.indices; y <- grid(0).indices if grid(x)(y))
      ans += (imapX(x + 1) - imapX(x)).toLong * (imapY(y + 1) - imapY(y))

    (ans % (1e9 + 7).toInt).toInt
  }
}
