package leetcode.codingchallenge2021.october

object BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int = {
    var buyer = 0
    var seller = Int.MinValue
    var rest = Int.MinValue

    for (price <- prices) {
      val b = buyer max rest
      val s = seller max (buyer - price)
      rest = seller + price
      buyer = b
      seller = s
    }

    buyer max rest
  }
}
