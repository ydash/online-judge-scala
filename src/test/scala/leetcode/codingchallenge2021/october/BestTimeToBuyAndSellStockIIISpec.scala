package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class BestTimeToBuyAndSellStockIIISpec extends LeetCodeSpec {
  private val table = Table(
    ("prices", "expected"),
    (Array(3, 3, 5, 0, 0, 3, 1, 4), 6),
    (Array(1, 2, 3, 4, 5), 4),
    (Array(7, 6, 4, 3, 1), 0),
    (Array(1), 0),
    (Array(2, 1, 2, 0, 1), 2)
  )

  test("Test of Best Time to Buy and Sell Stock III") {
    forAll(table) { (prices, expected) =>
      BestTimeToBuyAndSellStockIII.maxProfit(prices) shouldBe expected
    }
  }
}
