package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P52Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, 1),
    (2, 0),
    (4, 2)
  )

  test("Test of N-Queens II") {
    forAll(table) { (n, expected) =>
      P52.totalNQueens(n) shouldBe expected
    }
  }
}
