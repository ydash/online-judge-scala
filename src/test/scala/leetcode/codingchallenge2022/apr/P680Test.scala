package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P680Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("a", true),
    ("ab", true),
    ("aba", true),
    ("abc", false),
    ("abca", true),
    ("abcceba", true),
    ("abeccba", true),
    ("lcupucul", true),
    ("lucupucl", true),
  )

  test("Test of Valid Palindrome II") {
    forAll(table) { (s, expected) =>
      P680.validPalindrome(s) shouldBe expected
    }
  }
}
