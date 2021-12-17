package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P221Test extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (
      Array(
        Array('1', '0', '1', '0', '0'),
        Array('1', '0', '1', '1', '1'),
        Array('1', '1', '1', '1', '1'),
        Array('1', '0', '0', '1', '0')
      ),
      4
    ),
    (
      Array(
        Array('0', '1'),
        Array('1', '0')
      ),
      1
    ),
    (
      Array(
        Array('0')
      ),
      0
    )
  )

  test("Test of Maximal Square") {
    forAll(table) { (matrix, expected) =>
      P221.maximalSquare(matrix) shouldBe expected
    }
  }
}
