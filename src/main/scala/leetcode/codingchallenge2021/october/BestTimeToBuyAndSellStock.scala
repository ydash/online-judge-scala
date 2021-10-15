package leetcode.codingchallenge2021.october

object BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int = {
    val dp = new Array[Int](prices.length + 2)
    for (i <- prices.indices) {
      for (j <- i + 1 until prices.length) {
        val sum = dp(i) + prices(j) - prices(i)
        dp(j + 2) = dp(j + 2) max dp(j + 1) max sum
      }
    }

    dp.last
  }
}
