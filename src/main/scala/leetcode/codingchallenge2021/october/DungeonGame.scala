package leetcode.codingchallenge2021.october

object DungeonGame {
  def calculateMinimumHP(dungeon: Array[Array[Int]]): Int = {
    val m = dungeon.length
    val n = dungeon.head.length
    val dp = Array.fill(n + 1)(Int.MaxValue)
    dp(n - 1) = 1

    for (i <- (0 until m).reverse) {
      for (j <- (0 until n).reverse) {
        dp(j) = (dp(j + 1) min dp(j)) - dungeon(i)(j)
        if (dp(j) <= 0) dp(j) = 1
      }
    }
    dp.head
  }
}
