package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P84Test extends LeetCodeSpec {
  private val table = Table(
    ("heights", "expected"),
    (Array(0), 0),
    (Array(0, 42, 0), 42),
    (Array(1, 1, 1, 1, 1), 5),
    (Array(2, 1, 5, 6, 2, 3), 10),
    (Array(2, 4), 4)
  )

  test("Test of Largest Rectangle in Histogram") {
    forAll(table) { (heights, expected) =>
      P84.largestRectangleArea(heights) shouldBe expected
    }
  }
}
