package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P318Test extends LeetCodeSpec {
  private val table = Table(
    ("words", "expected"),
    (Array("a", "b"), 1),
    (Array("abc", "dea"), 0),
    (Array("abcw", "baz", "foo", "bar", "xtfn", "abcdef"), 16),
    (Array("a", "ab", "abc", "d", "cd", "bcd", "abcd"), 4),
    (Array("a", "aa", "aaa", "aaaa"), 0),
    (Array("zbd", "efa", "zzzz", "zde", "xyz"), 12)
  )

  test("Test of Maximum Product of Word Lengths") {
    forAll(table) { (words, expected) =>
      P318.maxProduct(words) shouldBe expected
    }
  }
}
