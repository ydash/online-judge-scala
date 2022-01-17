package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P290Test extends LeetCodeSpec {
  private val table = Table(
    ("pattern", "s", "expected"),
    ("abba", "dog cat cat dog", true),
    ("abba", "dog cat cat fish", false),
    ("aaaa", "dog cat cat dog", false),
    ("aaaa", "dog dog dog dog", true),
    ("abba", "dog dog dog dog", false)
  )

  test("Test of Word Pattern") {
    forAll(table) { (pattern, s, expected) =>
      P290.wordPattern(pattern, s) shouldBe expected
    }
  }
}
