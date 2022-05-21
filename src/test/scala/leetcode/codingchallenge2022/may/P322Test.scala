package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P322Test extends LeetCodeSpec {
  private val table = Table(
    ("coins", "amount", "expected"),
    (Array(1, 2, 5), 11, 3),
    (Array(2), 3, -1),
    (Array(1), 0, 0),
    (Array(1, Int.MaxValue), 2, 2)
  )

  test("Test of Coin Change") {
    forAll(table) { (coins, amount, expected) =>
      P322.coinChange(coins, amount) shouldBe expected
    }
  }
}
