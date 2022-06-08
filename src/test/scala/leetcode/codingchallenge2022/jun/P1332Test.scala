package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1332Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("ababa", 1),
    ("abba", 1),
    ("", 0),
    ("abb", 2),
    ("baabb", 2)
  )

  test("Test of Remove Palindromic Subsequences") {
    forAll(table) { (s, expected) =>
      P1332.removePalindromeSub(s) shouldBe expected
    }
  }
}
