package leetcode.codingchallenge2021.november

// 441. Arranging Coins
object ArrangingCoins {

  def arrangeCoins(n: Int): Int = (scala.math.sqrt(2 * n.toLong + 0.25) - 0.5).toInt

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
