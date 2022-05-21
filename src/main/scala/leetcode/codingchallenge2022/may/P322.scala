package leetcode.codingchallenge2022.may

// 322. Coin Change
object P322 {
  def coinChange(coins: Array[Int], amount: Int): Int =
    if (amount == 0) 0
    else {
      val minCoin = new Array[Int](amount + 1)
      for (n <- coins if n <= amount) minCoin(n) = 1
      for {
        i <- minCoin.indices
        if minCoin(i) > 0
        n <- coins
        if n < amount && i + n <= amount
      } {
        if (minCoin(i + n) == 0) minCoin(i + n) = minCoin(i) + 1
        else minCoin(i + n) = minCoin(i + n) min minCoin(i) + 1
      }
      if (minCoin.last == 0) -1
      else minCoin.last
    }
}
