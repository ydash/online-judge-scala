package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1631Test extends LeetCodeSpec {
  private val table = Table(
    ("heights", "expected"),
    (Array(Array(1, 2, 2), Array(3, 8, 2), Array(5, 3, 5)), 2),
    (Array(Array(1, 2, 3), Array(3, 8, 4), Array(5, 3, 5)), 1),
    (
      Array(
        Array(1, 2, 1, 1, 1),
        Array(1, 2, 1, 2, 1),
        Array(1, 2, 1, 2, 1),
        Array(1, 2, 1, 2, 1),
        Array(1, 1, 1, 2, 1)
      ),
      0
    )
  )

  test("Test of Path With Minimum Effort") {
    forAll(table) { (heights, expected) =>
      P1631.minimumEffortPath(heights) shouldBe expected
    }
  }
}
