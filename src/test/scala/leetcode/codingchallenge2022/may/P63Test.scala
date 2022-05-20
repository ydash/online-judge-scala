package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P63Test extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(0, 0, 0), Array(0, 1, 0), Array(0, 0, 0)), 2),
    (Array(Array(0, 1), Array(0, 0)), 1),
    (Array(Array(0)), 1),
    (Array(Array(0, 0, 1), Array(0, 1, 0), Array(0, 0, 0)), 1)
  )

  test("Test of Unique Paths II") {
    forAll(table) { (grid, expected) =>
      P63.uniquePathsWithObstacles(grid) shouldBe expected
    }
  }
}
