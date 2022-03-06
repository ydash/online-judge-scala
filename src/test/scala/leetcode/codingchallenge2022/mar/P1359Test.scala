package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1359Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, 1),
    (2, 6),
    (3, 90),
    (500, 764678010)
  )

  test("Test of Count All Valid Pickup and Delivery Options") {
    forAll(table) { (n, expected) =>
      P1359.countOrders(n) shouldBe expected
    }
  }
}
