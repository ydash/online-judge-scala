package leetcode.codingchallenge2022.jun

// 1423. Maximum Points You Can Obtain from Cards
object P1423 {
  def maxScore(cardPoints: Array[Int], k: Int): Int = {
    val sumFromLeft, sumFromRight = new Array[Int](k + 1)
    for (i <- 1 to k) {
      sumFromLeft(i) = sumFromLeft(i - 1) + cardPoints(i - 1)
      sumFromRight(i) = sumFromRight(i - 1) + cardPoints(cardPoints.length - i)
    }
    var result = 0
    for (i <- 0 to k) {
      result = result max (sumFromLeft(i) + sumFromRight(k - i))
    }
    result
  }
}
