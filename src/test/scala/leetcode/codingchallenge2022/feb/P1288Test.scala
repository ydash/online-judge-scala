package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P1288Test extends LeetCodeSpec {
  private val table = Table(
    ("intervals", "expected"),
    (Array(Array(1, 4), Array(3, 6), Array(2, 8)), 2),
    (Array(Array(1, 4), Array(2, 3)), 1),
    (Array(Array(0, 1), Array(1, 2)), 2),
    (Array(Array(1, 2), Array(1, 4), Array(3, 4)), 1)
  )

  test("Test of Remove Covered Intervals") {
    forAll(table) { (intervals, expected) =>
      P1288.removeCoveredIntervals(intervals) shouldBe expected
    }
  }
}
