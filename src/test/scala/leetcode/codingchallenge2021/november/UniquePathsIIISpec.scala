package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class UniquePathsIIISpec extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(1, 0, 0, 0), Array(0, 0, 0, 0), Array(0, 0, 2, -1)), 2),
    (Array(Array(1, 0, 0, 0), Array(0, 0, 0, 0), Array(0, 0, 0, 2)), 4),
    (Array(Array(0, 1), Array(2, 0)), 0)
  )

  test("Test of Unique Paths III") {
    forAll(table) { (grid, expected) =>
      UniquePathsIII.uniquePathsIII(grid) shouldBe expected
    }
  }
}
