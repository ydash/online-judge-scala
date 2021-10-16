package leetcode.codingchallenge2021.october

object BestTimeToBuyAndSellStockIII {
  def maxProfit(prices: Array[Int]): Int = {
    var buy1, buy2 = Int.MaxValue
    var sell1, result = 0

    for (price <- prices) {
      buy1 = buy1 min price
      sell1 = sell1 max (price - buy1)
      buy2 = buy2 min (price - sell1)
      result = result max (price - buy2)
    }

    result
  }
}
