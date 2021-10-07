package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class WordSearchSpec extends LeetCodeSpec {
  private val table = Table(
    ("board", "word", "expected"),
    (Array(Array('a')), "b", false),
    (Array(Array('a')), "a", true),
    (Array(Array('A', 'B', 'C', 'E'), Array('S', 'F', 'C', 'S'), Array('A', 'D', 'E', 'E')), "ABCCED", true),
    (Array(Array('A', 'B', 'C', 'E'), Array('S', 'F', 'C', 'S'), Array('A', 'D', 'E', 'E')), "SEE", true),
    (Array(Array('A', 'B', 'C', 'E'), Array('S', 'F', 'C', 'S'), Array('A', 'D', 'E', 'E')), "ABCB", false)
  )

  test("Test of Word Search") {
    forAll(table) { (board, word, expected) =>
      WordSearch.exist(board, word) shouldBe expected
    }
  }
}
