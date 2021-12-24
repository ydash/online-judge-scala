package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P56Test extends LeetCodeSpec {
  private val table = Table(
    ("intervals", "expected"),
    (Array(Array(1, 3), Array(2, 6), Array(8, 10), Array(15, 18)), Array(Array(1, 6), Array(8, 10), Array(15, 18))),
    (Array(Array(1, 4), Array(4, 5)), Array(Array(1, 5))),
    (Array(Array(1, 2), Array(4, 5)), Array(Array(1, 2), Array(4, 5))),
    (Array(Array(0, 1)), Array(Array(0, 1))),
    (Array(Array(2, 3), Array(4, 5), Array(6, 7), Array(1, 10)), Array(Array(1, 10)))
  )

  test("Test of Merge Intervals") {
    forAll(table) { (intervals, expected) =>
      P56.merge(intervals) shouldBe expected
    }
  }
}
