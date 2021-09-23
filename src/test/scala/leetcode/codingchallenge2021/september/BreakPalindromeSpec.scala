package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class BreakPalindromeSpec extends LeetCodeSpec {
  private val table = Table(
    ("palindrome", "expected"),
    ("abccba", "aaccba"),
    ("aaccaa", "aaacaa"),
    ("abcba", "aacba"),
    ("aba", "abb"),
    ("aaaa", "aaab"),
    ("a", "")
  )

  test("Test of Break a Palindrome") {
    forAll(table) { (palindrome, expected) =>
      BreakPalindrome.breakPalindrome(palindrome) shouldBe expected
    }
  }
}
