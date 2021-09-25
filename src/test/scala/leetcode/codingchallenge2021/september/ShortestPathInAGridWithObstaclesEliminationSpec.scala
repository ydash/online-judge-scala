package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ShortestPathInAGridWithObstaclesEliminationSpec extends LeetCodeSpec {
  private val table = Table(
    ("grid", "k", "expected"),
    (Array(Array(0, 0, 0), Array(1, 1, 0), Array(0, 0, 0), Array(0, 1, 1), Array(0, 0, 0)), 1, 6),
    (Array(Array(0, 1, 1), Array(1, 1, 1), Array(1, 0, 0)), 1, -1)
  )

  test("Test of Shortest Path in a Grid with Obstacles Elimination") {
    forAll(table) { (grid, k, expected) =>
      ShortestPathInAGridWithObstaclesElimination.shortestPath(grid, k) shouldBe expected
    }
  }
}
