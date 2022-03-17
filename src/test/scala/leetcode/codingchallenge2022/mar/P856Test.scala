package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P856Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("()", 1),
    ("(())", 2),
    ("()()", 2),
    ("(()())", 4),
    ("((()))", 4),
    ("((()))(())", 6),
    ("(())()((()))", 7)
  )

  test("Test of Score of Parentheses") {
    forAll(table) { (s, expected) =>
      P856.scoreOfParentheses(s) shouldBe expected
    }
  }
}
