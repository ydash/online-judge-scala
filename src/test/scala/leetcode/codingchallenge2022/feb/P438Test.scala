package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P438Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "p", "expected"),
    ("a", "a", List(0)),
    ("aaa", "a", List(0, 1, 2)),
    ("abcba", "ab", List(0, 3)),
    ("cbaebabacd", "abc", List(0, 6)),
    ("abab", "ab", List(0, 1, 2))
  )

  test("Test of Find All Anagrams in a String") {
    forAll(table) { (s, p, expected) =>
      P438.findAnagrams(s, p) shouldBe expected
    }
  }
}
