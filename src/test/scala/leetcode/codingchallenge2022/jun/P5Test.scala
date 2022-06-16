package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P5Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("babad", "bab"),
    ("cbbd", "bb"),
    ("deed", "deed"),
    ("abcde", "a"),
    ("abcba", "abcba")
  )

  test("Test of Longest Palindromic Substring") {
    forAll(table) { (s, expected) =>
      P5.longestPalindrome(s) shouldBe expected
    }
  }
}
