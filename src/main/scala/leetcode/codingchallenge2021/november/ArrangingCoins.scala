package leetcode.codingchallenge2021.november

// 441. Arranging Coins
object ArrangingCoins {
  def arrangeCoins(n: Int): Int = {
    var x = scala.math.sqrt(2L * n).ceil.toInt
    while (n < aux(x)) x -= 1
    x
  }
  private def aux(n: Int): Long = (n.toLong * (n + 1)) / 2

  def slowSolution(n: Int): Int = {
    var delta = 1
    var i = 0
    var sum = 0L
    while (sum <= n) {
      sum += delta
      i += 1
      delta += 1
    }

    i - 1
  }
}
