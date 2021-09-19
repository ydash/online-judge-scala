package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class DistinctSubsequencesSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "t", "expected"),
    ("rabbbit", "rabbit", 3),
    ("babgbag", "bag", 5),
    ("abc", "abc", 1),
    ("abc", "abcde", 0)
  )

  test("Test of Distinct Subsequences") {
    forAll(table) { (s, t, expected) =>
      DistinctSubsequences.numDistinct(s, t) shouldBe expected
    }
  }
}
