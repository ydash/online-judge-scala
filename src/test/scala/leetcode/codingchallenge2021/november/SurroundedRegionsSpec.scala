package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class SurroundedRegionsSpec extends LeetCodeSpec {
  private val table = Table(
    ("board", "expected"),
    (
      Array(Array('X', 'X', 'X', 'X'), Array('X', 'O', 'O', 'X'), Array('X', 'X', 'O', 'X'), Array('X', 'O', 'X', 'X')),
      Array(Array('X', 'X', 'X', 'X'), Array('X', 'X', 'X', 'X'), Array('X', 'X', 'X', 'X'), Array('X', 'O', 'X', 'X'))
    ),
    (Array(Array('X')), Array(Array('X'))),
    (
      Array(
        Array('O', 'X', 'X', 'O', 'X'),
        Array('X', 'O', 'O', 'X', 'O'),
        Array('X', 'O', 'X', 'O', 'X'),
        Array('O', 'X', 'O', 'O', 'O'),
        Array('X', 'X', 'O', 'X', 'O')
      ),
      Array(
        Array('O', 'X', 'X', 'O', 'X'),
        Array('X', 'X', 'X', 'X', 'O'),
        Array('X', 'X', 'X', 'O', 'X'),
        Array('O', 'X', 'O', 'O', 'O'),
        Array('X', 'X', 'O', 'X', 'O')
      )
    )
  )

  test("Test of Surrounded Regions") {
    forAll(table) { (board, expected) =>
      SurroundedRegions.solve(board)
      board.map(_.mkString).mkString("\n") shouldBe expected.map(_.mkString).mkString("\n")
    }
  }
}
