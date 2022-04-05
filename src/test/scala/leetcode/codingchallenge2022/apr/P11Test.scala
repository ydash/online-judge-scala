package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P11Test extends LeetCodeSpec {
  private val table = Table(
    ("height", "expected"),
    (Array(1, 1), 1),
    (Array(1, 8, 6, 2, 5, 4, 8, 3, 7), 49)
  )

  test("Test of Container With Most Water") {
    forAll(table) { (height, expected) =>
      P11.maxArea(height) shouldBe expected
    }
  }
}
