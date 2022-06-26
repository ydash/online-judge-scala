package leetcode.codingchallenge2022.jun

// 1423. Maximum Points You Can Obtain from Cards
object P1423 {
  def maxScore(cardPoints: Array[Int], k: Int): Int = {
    var result, currentSum = cardPoints.takeRight(k).sum
    for (i <- 0 until k) {
      currentSum += cardPoints(i)
      currentSum -= cardPoints(cardPoints.length - k + i)
      result = result max currentSum
    }
    result
  }
}
