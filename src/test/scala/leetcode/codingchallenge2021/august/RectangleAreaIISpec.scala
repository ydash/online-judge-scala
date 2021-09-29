package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class RectangleAreaIISpec extends LeetCodeSpec {
  private val table = Table(
    ("rectangles", "expected"),
    (Array(Array(0, 0, 2, 2)), 4),
    (Array(Array(0, 0, 2, 2), Array(1, 0, 2, 3)), 5),
    (Array(Array(0, 0, 2, 2), Array(1, 0, 2, 3), Array(1, 0, 3, 1)), 6),
    (Array(Array(0, 0, 1e9.toInt, 1e9.toInt)), 49)
  )

  test("test") {
    forAll(table) { (rectangles, expected) =>
      RectangleAreaII.rectangleArea(rectangles) shouldBe expected
    }
  }
}
