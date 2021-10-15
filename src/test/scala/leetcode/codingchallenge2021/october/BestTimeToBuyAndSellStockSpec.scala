package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class BestTimeToBuyAndSellStockSpec extends LeetCodeSpec {
  private val table = Table(
    ("prices", "expected"),
    (Array(1, 2, 3, 0, 2), 3),
    (Array(1, 2, 3, 2, 2), 2),
    (Array(1), 0),
    (Array(6, 1, 6, 4, 3, 0, 2), 7)
  )

  test("Test of Best Time to Buy and Sell Stock") {
    forAll(table) { (prices, expected) =>
      BestTimeToBuyAndSellStock.maxProfit(prices) shouldBe expected
    }
  }
}
