package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P1217Test extends LeetCodeSpec {
  private val table = Table(
    ("position", "expected"),
    (Array(1, 2, 3), 1),
    (Array(2, 2, 2, 3, 3), 2),
    (Array(1, 1000000000), 1)
  )

  test("Test of Minimum Cost to Move CHips to The Same Position") {
    forAll(table) { (position, expected) =>
      P1217.minCostToMoveChips(position) shouldBe expected
    }
  }
}
