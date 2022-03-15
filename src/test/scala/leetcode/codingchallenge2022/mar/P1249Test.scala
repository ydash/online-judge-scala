package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1249Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("lee(t(c)o)de)", "lee(t(c)o)de"),
    ("a)b(c)d", "ab(c)d"),
    ("))((", ""),
    ("a", "a"),
    ("(", ""),
    (")", "")
  )

  test("Test of Minimum Remove to Make Valid Parentheses") {
    forAll(table) { (s, expected) =>
      P1249.minRemoveToMakeValid(s) shouldBe expected
    }
  }
}
