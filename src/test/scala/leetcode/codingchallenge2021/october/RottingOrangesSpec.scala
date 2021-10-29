package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class RottingOrangesSpec extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(2, 1, 1), Array(1, 1, 0), Array(0, 1, 1)), 4),
    (Array(Array(2, 1, 1), Array(0, 1, 1), Array(1, 0, 1)), -1),
    (Array(Array(0, 2)), 0)
  )

  test("Test of Rotting Oranges") {
    forAll(table) { (grid, expected) =>
      RottingOrange.orangesRotting(grid) shouldBe expected
    }
  }
}
