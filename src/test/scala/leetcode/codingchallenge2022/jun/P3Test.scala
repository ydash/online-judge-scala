package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P3Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("abcabcbb", 3),
    ("bbbbb", 1),
    ("pwwkew", 3),
    (" ", 1),
    ("waaaw", 2)
  )

  test("Test of Longest Substring Without Repeating Characters") {
    forAll(table) { (s, expected) =>
      P3.lengthOfLongestSubstring(s) shouldBe expected
    }
  }
}
