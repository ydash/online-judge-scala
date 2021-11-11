package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class BestTimeToBuyAndSellStockIISpec extends LeetCodeSpec {
  private val table = Table(
    ("prices", "expected"),
    (Array(7, 1, 5, 3, 6, 4), 7),
    (Array(1, 2, 3, 4, 5), 4),
    (Array(7, 6, 4, 3, 1), 0)
  )

  test("Test of Best Time to Buy and Sell Stock II") {
    forAll(table) { (prices, expected) =>
      BestTimeToBuyAndSellStockII.maxProfit(prices) shouldBe expected
    }
  }
}
