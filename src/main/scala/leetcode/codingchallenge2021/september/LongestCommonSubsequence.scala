package leetcode.codingchallenge2021.september

object LongestCommonSubsequence {
  def longestCommonSubsequence(text1: String, text2: String): Int = {
    val dp = new Array[Int](text2.length + 1)
    for (c <- text1) {
      val prev = dp.clone()
      for (i <- text2.indices) {
        if (c == text2(i)) dp(i + 1) = prev(i) + 1
        else dp(i + 1) = prev(i + 1) max dp(i)
      }
    }
    dp.last
  }
}
