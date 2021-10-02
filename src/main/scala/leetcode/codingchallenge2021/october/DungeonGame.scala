package leetcode.codingchallenge2021.october

object DungeonGame {
  def calculateMinimumHP(dungeon: Array[Array[Int]]): Int = {
    val m = dungeon.length
    val n = dungeon.head.length
    val dp = Array.fill(m + 1)(Array.fill(n + 1)(Int.MaxValue))
    dp(m)(n - 1) = 1

    for (i <- (0 until m).reverse) {
      for (j <- (0 until n).reverse) {
        dp(i)(j) = (dp(i)(j + 1) min dp(i + 1)(j)) - dungeon(i)(j)
        if (dp(i)(j) <= 0) dp(i)(j) = 1
      }
    }
    dp.head.head
  }
}
