package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P647Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("abc", 3),
    ("aaa", 6)
  )

  test("Test of Palindromic Substrings") {
    forAll(table) { (s, expected) =>
      P647.countSubstrings(s) shouldBe expected
    }
  }
}
