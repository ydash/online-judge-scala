package leetcode.codingchallenge2021.november

object UniqueBinarySearchTrees {
  def numTrees(n: Int): Int = {
    val dp = new Array[Int](n + 1)
    dp(0) = 1; dp(1) = 1
    for (i <- 2 to n; j <- 1 to i) dp(i) += dp(j - 1) * dp(i - j)
    dp(n)
  }
}
