package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class LongestCommonSubsequenceSpec extends LeetCodeSpec {
  private val table = Table(
    ("text1", "text2", "expected"),
    ("abcde", "ace", 3),
    ("abc", "def", 0),
    ("abc", "abc", 3),
    ("ezupkr", "ubmrapg", 2),
    ("hofubmnylkra", "pqhgxgdofcvmr", 5),
    ("bsbininm", "jmjkbkjkv", 1)
  )

  test("Test of Longest Common Subsequence") {
    forAll(table) { (text1, text2, expected) =>
      LongestCommonSubsequence.longestCommonSubsequence(text1, text2) shouldBe expected
    }
  }
}
