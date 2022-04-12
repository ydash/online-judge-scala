package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P289Test extends LeetCodeSpec {
  private val table = Table(
    ("board", "expected"),
    (
      Array(Array(0, 1, 0), Array(0, 0, 1), Array(1, 1, 1), Array(0, 0, 0)),
      Array(Array(0, 0, 0), Array(1, 0, 1), Array(0, 1, 1), Array(0, 1, 0))
    )
  )

  test("Test of Game of Life") {
    forAll(table) { (board, expected) =>
      P289.gameOfLife(board)
      board shouldBe expected
    }
  }
}
