package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1091Test extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(0)), 1),
    (Array(Array(0, 1), Array(1, 0)), 2),
    (Array(Array(0, 0, 0), Array(1, 1, 0), Array(1, 1, 0)), 4),
    (Array(Array(0, 0, 0), Array(1, 1, 0), Array(1, 1, 1)), -1),
    (Array(Array(1, 0, 0), Array(1, 1, 0), Array(1, 1, 0)), -1),
    (
      Array(
        Array(0, 0, 0, 0, 1, 1),
        Array(1, 1, 1, 1, 0, 1),
        Array(1, 1, 0, 1, 1, 0),
        Array(1, 0, 1, 0, 0, 1),
        Array(0, 1, 1, 1, 1, 1),
        Array(1, 0, 0, 0, 0, 0)
      ),
      16
    )
  )

  test("Test of Shortest Path in Binary Matrix") {
    forAll(table) { (grid, expected) =>
      P1091.shortestPathBinaryMatrix(grid) shouldBe expected
    }
  }
}
