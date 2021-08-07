package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class PalindromePartitioningIISpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("aab", 1),
    ("a", 0),
    ("ab", 1),
    ("abc", 2),
    ("abcba", 0),
    ("aaabba", 1)
  )

  test("Test of Palindrome Partitioning II") {
    forAll(table) { (s, expected) =>
      PalindromePartitioningII.minCut(s) shouldBe expected
    }
  }
}
