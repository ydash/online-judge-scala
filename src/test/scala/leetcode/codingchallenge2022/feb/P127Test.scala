package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P127Test extends LeetCodeSpec {
  private val table = Table(
    ("beginWord", "endWord", "wordList", "expected"),
    ("a", "b", List("b", "c", "d"), 2),
    ("hit", "cog", List("hot", "dot", "dog", "lot", "log", "cog"), 5),
    ("hit", "cog", List("hot", "dot", "dog", "lot", "log"), 0)
  )

  test("Test of Word Ladder") {
    forAll(table) { (beginWord, endWord, wordList, expected) =>
      P127.ladderLength(beginWord, endWord, wordList) shouldBe expected
    }
  }
}
