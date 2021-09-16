package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class SpiralMatrixSpec extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (Array(Array(1)), List(1)),
    (Array(Array(1, 2)), List(1, 2)),
    (Array(Array(1), Array(2)), List(1, 2)),
    (Array(Array(1, 2), Array(3, 4)), List(1, 2, 4, 3)),
    (Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9)), List(1, 2, 3, 6, 9, 8, 7, 4, 5)),
    (Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12)), List(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)),
    (
      Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9), Array(10, 11, 12)),
      List(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8)
    ),
    (
      Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12), Array(13, 14, 15, 16)),
      List(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)
    )
  )

  test("Test of Spiral Matrix") {
    forAll(table) { (matrix, expected) =>
      SpiralMatrix.spiralOrder(matrix) shouldBe expected
    }
  }
}
