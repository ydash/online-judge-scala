package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P392Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "t", "expected"),
    ("", "", true),
    ("", "abc", true),
    ("abc", "", false),
    ("abc", "ahbgdc", true),
    ("axc", "ahbgdc", false)
  )

  test("Test of Is Subsequence") {
    forAll(table) { (s, t, expected) =>
      P392.isSubsequence(s, t) shouldBe expected
    }
  }
}
