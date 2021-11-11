package leetcode.codingchallenge2021.november

object BestTimeToBuyAndSellStockII {
  def maxProfit(prices: Array[Int]): Int = (1 until prices.length).foldLeft(0) { (acc, i) => acc + (prices(i) - prices(i - 1)).max(0)}
}
