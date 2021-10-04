package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class IslandPerimeterSpec extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(0, 1, 0, 0), Array(1, 1, 1, 0), Array(0, 1, 0, 0), Array(1, 1, 0, 0)), 16),
    (Array(Array(1)), 4),
    (Array(Array(1, 0)), 4)
  )

  test("Test of Island Perimeter") {
    forAll(table) { (grid, expected) =>
      IslandPerimeter.islandPerimeter(grid) shouldBe expected
    }
  }
}
