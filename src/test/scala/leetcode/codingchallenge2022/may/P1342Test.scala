package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1342Test extends LeetCodeSpec {
  private val table = Table(
    ("num", "expected"),
    (0, 0),
    (1, 1),
    (3, 3),
    (14, 6),
    (8, 4),
    (123, 12)
  )

  test("Test of Number of Steps to Reduce a Number to Zero") {
    forAll(table) { (num, expected) =>
      P1342.numberOfSteps(num) shouldBe expected
    }
  }
}
