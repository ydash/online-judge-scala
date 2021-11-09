package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class NumberOfValidWordsForEachPuzzleSpec extends LeetCodeSpec {
  private val table = Table(
    ("words", "puzzles", "expected"),
    (
      Array("aaaa", "asas", "able", "ability", "actt", "actor", "access"),
      Array("aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"),
      List(1, 1, 3, 2, 4, 0)
    ),
    (
      Array("apple", "pleas", "please"),
      Array("aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"),
      List(0, 1, 3, 2, 0)
    )
  )

  test("Test of Number of Valid Words for Each Puzzle") {
    forAll(table) { (words, puzzles, expected) =>
      NumberOfValidWordsForEachPuzzle.findNumOfValidWords(words, puzzles) shouldBe expected
    }
  }
}
