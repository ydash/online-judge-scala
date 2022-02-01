package leetcode.codingchallenge2022.feb

// 121. Best Time to Buy and Sell Stock
object P121 {
  def maxProfit(prices: Array[Int]): Int = {
    var acc, result = 0
    for (i <- 1 until prices.length) {
      acc = 0 max (acc + prices(i) - prices(i - 1))
      result = result max acc
    }
    result
  }
}
