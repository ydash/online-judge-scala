package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class SetMatrixZeroesSpec extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1)), Array(Array(1, 0, 1), Array(0, 0, 0), Array(1, 0, 1))),
    (Array(Array(0, 1, 2, 0), Array(3, 4, 5, 2), Array(1, 3, 1, 5)), Array(Array(0, 0, 0, 0), Array(0, 4, 5, 0), Array(0, 3, 1, 0))),
    (Array(Array(1, 1, 2, 0), Array(3, 4, 5, 2), Array(1, 3, 1, 5)), Array(Array(0, 0, 0, 0), Array(3, 4, 5, 0), Array(1, 3, 1, 0)))
  )

  test("Test of Set Matrix Zeroes") {
    forAll(table) { (matrix, expected) =>
      SetMatrixZeroes.setZeroes(matrix)
      matrix shouldBe expected
    }
  }
}
