package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class MakingLargeIslandSpec extends LeetCodeSpec {

  test("Test of Making A Large Island") {
    val table = Table(
      ("grid", "expected"),
      (Array(Array(1, 0), Array(0, 1)), 3),
      (Array(Array(1, 1), Array(1, 0)), 4),
      (Array(Array(0, 1, 0), Array(1, 0, 1), Array(0, 1, 0)), 5),
      (Array(Array(1, 1), Array(1, 1)), 4),
      (Array(Array(0, 0), Array(0, 0)), 1)
    )
    forAll(table) { (grid, expected) =>
      MakingLargeIsland.largestIsland(grid) shouldBe expected
    }
  }
}
