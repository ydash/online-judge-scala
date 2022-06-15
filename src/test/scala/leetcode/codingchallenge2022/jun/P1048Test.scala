package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1048Test extends LeetCodeSpec {
  private val table = Table(
    ("words", "expected"),
    (Array("a", "b", "ba", "bca", "bda", "bdca"), 4),
    (Array("xbc", "pcxbcf", "xb", "cxbc", "pcxbc"), 5),
    (Array("abcd", "dbqca"), 1),
    (Array("a"), 1),
    (Array("a", "b", "c", "abc"), 1),
    (Array("a", "ab", "abcd", "abcde", "abcdef"), 3)
  )

  test("Test of Longest String Chain") {
    forAll(table) { (words, expected) =>
      P1048.longestStrChain(words) shouldBe expected
    }
  }
}
