package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P74Test extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "target", "expected"),
    (Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 3, true),
    (Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 20, true),
    (Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 23, true),
    (Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 13, false),
    (Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 88, false),
    (Array(Array(2, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 1, false),
    (Array(Array(1)), 1, true),
    (Array(Array(1)), 2, false),
    (Array(Array(2)), 1, false)
  )

  test("Test of Search a 2D Matrix") {
    forAll(table) { (matrix, target, expected) =>
      P74.searchMatrix(matrix, target) shouldBe expected
    }
  }
}
