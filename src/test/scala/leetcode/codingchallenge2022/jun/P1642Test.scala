package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1642Test extends LeetCodeSpec {
  private val table = Table(
    ("heights", "bricks", "ladders", "expected"),
    (Array(4, 2, 7, 6, 9, 14, 12), 5, 1, 4),
    (Array(4, 12, 2, 7, 3, 18, 20, 3, 19), 10, 2, 7),
    (Array(14, 3, 19, 3), 17, 0, 3),
    (Array(100, 100, 100, 100, 100), 0, 5, 4),
    (Array(5, 4, 3, 2, 1), 0, 0, 4),
    (Array(1), 5, 1, 0)
  )

  test("Test of Furthest Building You Can Reach") {
    forAll(table) { (heights, bricks, ladders, expected) =>
      P1642.furthestBuilding(heights, bricks, ladders) shouldBe expected
    }
  }
}
