package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P520Test extends LeetCodeSpec {
  private val table = Table(
    ("word", "expected"),
    ("A", true),
    ("b", true),
    ("USA", true),
    ("Capital", true),
    ("FlaG", false),
    ("leetcode", true),
    ("leetCode", false)
  )

  test("Test of Detect Capital") {
    forAll(table) { (word, expected) =>
      P520.detectCapitalUse(word) shouldBe expected
    }
  }
}
