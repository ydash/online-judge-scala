package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class FindWinnerOnATicTacToeGameSpec extends LeetCodeSpec {
  private val table = Table(
    ("moves", "A"),
    (Array(Array(0, 0), Array(2, 0), Array(1, 1), Array(2, 1), Array(2, 2)), "A"),
    (Array(Array(1, 0), Array(0, 0), Array(1, 1), Array(0, 1), Array(1, 2)), "A"),
    (Array(Array(1, 0), Array(1, 1), Array(2, 0), Array(0, 1), Array(0, 0)), "A"),
    (Array(Array(0, 0), Array(1, 1), Array(0, 1), Array(0, 2), Array(1, 0), Array(2, 0)), "B"),
    (Array(Array(1, 0), Array(2, 0), Array(1, 1), Array(2, 1), Array(0, 2), Array(2, 2)), "B"),
    (Array(Array(1, 0), Array(2, 2), Array(1, 1), Array(1, 2), Array(0, 0), Array(0, 2)), "B"),
    (
      Array(
        Array(0, 0),
        Array(1, 1),
        Array(2, 0),
        Array(1, 0),
        Array(1, 2),
        Array(2, 1),
        Array(0, 1),
        Array(0, 2),
        Array(2, 2)
      ),
      "Draw"
    ),
    (Array(Array(0, 0), Array(1, 1)), "Pending")
  )

  test("Test of Find Winner on a Tic Tec Toe Game") {
    forAll(table) { (moves, expected) =>
      FindWinnerOnATicTacToeGame.tictactoe(moves) shouldBe expected
    }
  }
}
