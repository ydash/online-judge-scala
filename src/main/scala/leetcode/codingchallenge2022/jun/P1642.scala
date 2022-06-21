package leetcode.codingchallenge2022.jun

// 1642. Furthest Building You Can Reach
object P1642 {
  def furthestBuilding(heights: Array[Int], bricks: Int, ladders: Int): Int = {
    var restBricks = bricks
    val minLadderHeap = collection.mutable.PriorityQueue.empty[Int](Ordering.Int.reverse)
    for (i <- 1 until heights.length) {
      val diff = heights(i) - heights(i - 1)
      if (diff > 0) {
        minLadderHeap += diff
        if (minLadderHeap.length > ladders) restBricks -= minLadderHeap.dequeue()
        if (restBricks < 0) return i - 1
      }
    }
    heights.length - 1
  }
}
