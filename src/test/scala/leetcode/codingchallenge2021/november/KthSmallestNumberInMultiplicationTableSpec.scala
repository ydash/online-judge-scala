package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class KthSmallestNumberInMultiplicationTableSpec extends LeetCodeSpec {
  private val table = Table(
    ("m", "n", "k", "expected"),
    (2, 3, 6, 6),
    (9895, 28405, 100787757, 31666344)
  )

  test("Test of Kth Smallest Number in Multiplication Table") {
    forAll(table) { (m, n, k, expected) =>
      KthSmallestNumberInMultiplicationTable.findKthNumber(m, n, k) shouldBe expected
    }
  }
}
