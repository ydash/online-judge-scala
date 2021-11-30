package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P85Test extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (
      Array(
        Array('1', '0', '1', '0', '0'),
        Array('1', '0', '1', '1', '1'),
        Array('1', '1', '1', '1', '1'),
        Array('1', '0', '0', '1', '0')
      ),
      6
    ),
    (Array[Array[Char]](), 0),
    (Array(Array('0')), 0),
    (Array(Array('1')), 1)
  )

  test("Test of Maximal Rectangle") {
    forAll(table) { (matrix, expected) =>
      P85.maximalRectangle(matrix) shouldBe expected
    }
  }
}
