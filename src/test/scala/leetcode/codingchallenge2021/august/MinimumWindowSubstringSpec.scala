package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class MinimumWindowSubstringSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "t", "expected"),
    ("ADOBECODEBANC", "ABC", "BANC"),
    ("a", "a", "a"),
    ("a", "b", ""),
    ("a", "aa", ""),
    ("abc", "aab", ""),
    ("abcdef", "c", "c"),
    ("abcde", "ae", "abcde"),
    ("cabwefgewcwaefgcf", "cae", "cwae"),
    ("baac", "abc", "baac")
  )
  test("Test of Minimum Window Substring") {
    forAll(table) { (s, t, expected) =>
      MinimumWindowSubstring.minWindow(s, t) shouldBe expected
    }
  }
}
