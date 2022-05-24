package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P32Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("(()", 2),
    (")()())", 4),
    ("", 0),
    ("()(()", 2),
    ("()(()(()))", 10)
  )

  test("Test of Longest Valid Parentheses") {
    forAll(table) { (s, expected) =>
      P32.longestValidParentheses(s) shouldBe expected
    }
  }
}
