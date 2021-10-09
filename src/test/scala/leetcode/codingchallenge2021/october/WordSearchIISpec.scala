package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class WordSearchIISpec extends LeetCodeSpec {
  private val table = Table(
    ("board", "words", "expected"),
    (
      Array(Array('o', 'a', 'a', 'n'), Array('e', 't', 'a', 'e'), Array('i', 'h', 'k', 'r'), Array('i', 'f', 'l', 'v')),
      Array("oath", "pea", "eat", "rain"),
      List("eat", "oath")
    ),
    (Array(Array('a', 'b'), Array('c', 'd')), Array("abcd"), List()),
    (Array(Array('a')), Array("a"), List("a")),
    (Array(Array('a')), Array("b"), List()),
    (
      Array(
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
        Array('a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a')
      ),
      Array("aaaaaaa", "aaaaaaaaaa", "abcde"),
      List("aaaaaaa", "aaaaaaaaaa")
    )
  )

  test("Test of Word Search II") {
    forAll(table) { (board, words, expected) =>
      WordSearchII.findWords(board, words) should contain theSameElementsAs expected
    }
  }
}
