package leetcode.codingchallenge2022.jan

// 875. Koko Eating Bananas
object P875 {
  def minEatingSpeed(piles: Array[Int], h: Int): Int = {
    @scala.annotation.tailrec
    def binSearch(left: Int, right: Int): Int = {
      if (left > right) left
      else {
        val m = (left + right) / 2
        if (canEat(m)) binSearch(left, m - 1)
        else binSearch(m + 1, right)
      }
    }
    def canEat(k: Int): Boolean = piles.foldLeft(0L) { (acc, n) => acc + (n.toDouble/ k).ceil.toLong } <= h

    binSearch(1, piles.max)
  }
}
