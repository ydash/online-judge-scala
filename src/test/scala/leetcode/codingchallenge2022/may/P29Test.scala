package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P29Test extends LeetCodeSpec {
  private val table = Table(
    ("dividend", "divisor", "expected"),
    (10, 3, 3),
    (7, -3, -2),
    (-8, -4, 2),
    (-10, 3, -3),
    (0, 4, 0),
    (0, -3, 0),
    (Int.MaxValue, 1, Int.MaxValue),
    (Int.MaxValue, -1, -Int.MaxValue),
    (Int.MinValue, 1, Int.MinValue),
    (Int.MinValue, -1, Int.MaxValue)
  )

  test("Test of Divide Two Integers") {
    forAll(table) { (dividend, divisor, expected) =>
      P29.divide(dividend, divisor) shouldBe expected
    }
  }
}
