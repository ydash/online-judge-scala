package leetcode.codingchallenge2022.jun

// 583. Delete Operation for Two Strings
object P583 {
  def minDistance(word1: String, word2: String): Int = {
    val dp = Array.tabulate(word2.length + 1)(i => i)
    for (i <- word1.indices) {
      var diagCache: Int = dp(0)
      dp(0) += 1
      for (j <- word2.indices) {
        val tmp = dp(j + 1)
        dp(j + 1) = (dp(j) + 1) min (dp(j + 1) + 1) min (diagCache + (if (word1(i) == word2(j)) 0 else 2))
        diagCache = tmp
      }
    }
    dp.last
  }
}
