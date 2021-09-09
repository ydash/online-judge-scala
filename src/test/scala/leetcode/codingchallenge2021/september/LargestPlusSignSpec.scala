package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class LargestPlusSignSpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "mines", "expected"),
    (1, Array(Array(0, 0)), 0),
    (2, Array(Array(1, 1)), 1),
    (5, Array(Array(4, 2)), 2)
  )

  test("Test of Largest Plus Sign") {
    forAll(table) { (n, mines, expected) =>
      LargestPlusSign.orderOfLargestPlusSign(n, mines) shouldBe expected
    }
  }
}
