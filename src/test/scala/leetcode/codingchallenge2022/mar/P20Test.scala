package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P20Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("()", true),
    ("{}", true),
    ("[]", true),
    ("(}", false),
    ("()[]{}", true),
    ("((){[]})", true)
  )

  test("Test of Valid Parentheses") {
    forAll(table) { (s, expected) =>
      P20.isValid(s) shouldBe expected
    }
  }
}
