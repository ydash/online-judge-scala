package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P583Test extends LeetCodeSpec {
  private val table = Table(
    ("word1", "word2", "expected"),
    ("sea", "eat", 2),
    ("leetcode", "etco", 4),
    ("a", "d", 2),
    ("a", "a", 0)
  )

  test("Test of Delete Operation for Two Strings") {
    forAll(table) { (word1, word2, expected) =>
      P583.minDistance(word1, word2) shouldBe expected
    }
  }
}
