package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P51Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, List(List("Q"))),
    (4, List(List(".Q..", "...Q", "Q...", "..Q."), List("..Q.", "Q...", "...Q", ".Q..")))
  )

  test("Test of N-Queens") {
    forAll(table) { (n, expected) =>
      P51.solveNQueens(n) shouldBe expected
    }
  }
}
