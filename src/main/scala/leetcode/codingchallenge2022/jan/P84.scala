package leetcode.codingchallenge2022.jan

object P84 {
  def largestRectangleArea(seqOfHistogram: Array[Int]): Int = {
    val highest = seqOfHistogram.max
    val dp = new Array[Int](highest + 1)
    var result = 0
    for (h <- seqOfHistogram) {
      for (i <- 1 to h) {
        dp(i) = dp(i) + i
        result = result max dp(i)
      }
      for (i <- h + 1 to highest) dp(i) = 0
    }
    result
  }
}
