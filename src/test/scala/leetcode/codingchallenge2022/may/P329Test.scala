package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P329Test extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expectd"),
    (Array(Array(9, 9, 4), Array(6, 6, 8), Array(2, 1, 1)), 4),
    (Array(Array(3, 4, 5), Array(3, 2, 6), Array(2, 2, 1)), 4),
    (Array(Array(1)), 1)
  )

  test("Test of Longest Increasing Path in a Matrix") {
    forAll(table) { (matrix, expected) =>
      P329.longestIncreasingPath(matrix) shouldBe expected
    }
  }
}
