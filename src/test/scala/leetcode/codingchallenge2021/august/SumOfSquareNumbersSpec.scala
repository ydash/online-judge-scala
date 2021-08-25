package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class SumOfSquareNumbersSpec extends LeetCodeSpec {
  private val table = Table(
    ("c", "expected"),
    (5, true),
    (3, false),
    (4, true),
    (2, true),
    (1, true),
    (0, true)
  )
  test("Test of Sum of Square Numbers") {
    forAll(table) { (c, expected) =>
      SumOfSquareNumbers.judgeSquareSum(c) shouldBe expected
    }
  }
}
