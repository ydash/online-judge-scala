package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P452Test extends LeetCodeSpec {
  private val table = Table(
    ("points", "expected"),
    (Array(Array(10, 16), Array(2, 8), Array(1, 6), Array(7, 12)), 2),
    (Array(Array(1, 2), Array(3, 4), Array(5, 6), Array(7, 8)), 4),
    (Array(Array(1, 2), Array(2, 3), Array(3, 4), Array(4, 5)), 2)
  )

  test("Test of Minimum Number of Arrows to Burst Balloons") {
    forAll(table) { (points, expected) =>
      P452.findMinArrowShots(points) shouldBe expected
    }
  }
}
