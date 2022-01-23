package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1291Test extends LeetCodeSpec {
  private val table = Table(
    ("low", "high", "expected"),
    (100, 300, List(123, 234)),
    (1000, 13000, List(1234, 2345, 3456, 4567, 5678, 6789, 12345))
  )

  test("Test of Sequential Digits") {
    forAll(table) { (low, high, expected) =>
      P1291.sequentialDigits(low, high) shouldBe expected
    }
  }
}
