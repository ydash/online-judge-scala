package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class LongestUncommonSubsequenceIISpec extends LeetCodeSpec {
  private val table = Table(
    ("strs", "expected"),
    (Array("aba", "cdc", "eae"), 3),
    (Array("aaa", "aaa", "aa"), -1),
    (Array("aabbcc", "aabbcc", "c", "e", "aabbcd"), 6)
  )

  test("Test of Longest Uncommon Subsequence II") {
    forAll(table) { (strs, expected) =>
      LongestUncommonSubsequenceII.findLUSlength(strs) shouldBe expected
    }
  }
}
