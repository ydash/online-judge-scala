package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class MatrixRankTransformSpec extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (Array(Array(1, 2), Array(3, 4)), Array(Array(1, 2), Array(2, 3))),
    (Array(Array(7, 7), Array(7, 7)), Array(Array(1, 1), Array(1, 1))),
    (Array(Array(20, -21, 14), Array(-19, 4, 19), Array(22, -47, 24), Array(-19, 4, 19)), Array(Array(4, 2, 3), Array(1, 3, 4), Array(5, 1, 6), Array(1, 3, 4))),
    (Array(Array(7, 3, 6), Array(1, 4, 5), Array(9, 8, 2)), Array(Array(5, 1, 4), Array(1, 2, 3), Array(6, 3, 1))),
    (Array(Array(3, 1), Array(2, 2)), Array(Array(3, 1), Array(2, 2))),
    (Array(Array(3, 2), Array(1, 2)), Array(Array(3, 2), Array(1, 2))),
  )

  test("Test of Rank Transform of a Matrix") {
    forAll(table) { (matrix, expected) =>
      MatrixRankTransform.matrixRankTransform(matrix) shouldBe expected
    }
  }
}
