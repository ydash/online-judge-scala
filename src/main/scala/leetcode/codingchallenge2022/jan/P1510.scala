package leetcode.codingchallenge2022.jan

// 1510. Stone Game IV
object P1510 {
  def winnerSquareGame(n: Int): Boolean = {
    val dp = new Array[Boolean](n + 1)
    for (i <- 0 until n if !dp(i)) {
      var j, sqr = 1
      while (i + sqr <= n) {
        dp(i + sqr) = dp(i + sqr) || !dp(i)
        j += 1
        sqr = j * j
      }
    }
    dp.last
  }
}
