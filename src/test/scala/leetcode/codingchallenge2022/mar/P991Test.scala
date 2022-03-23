package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P991Test extends LeetCodeSpec {
  private val table = Table(
    ("startValue", "target", "expected"),
    (2, 3, 2),
    (5, 8, 2),
    (3, 10, 3),
    (10, 10, 0),
    (10, 9, 1),
    (10, 20, 1),
    (1, 10, 6),
    (10, 1, 9)
  )

  test("Test of Broken Calculator") {
    forAll(table) { (startValue, target, expected) =>
      P991.brokenCalc(startValue, target) shouldBe expected
    }
  }
}
