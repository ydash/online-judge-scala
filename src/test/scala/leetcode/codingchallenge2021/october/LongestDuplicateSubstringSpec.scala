package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class LongestDuplicateSubstringSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("banana", "ana"),
    ("abcd", "")
  )

  test("Test of Longest Duplicate Substring") {
    forAll(table) { (s, expected) =>
      LongestDuplicateSubstring.longestDupSubstring(s) shouldBe expected
    }
  }
}
