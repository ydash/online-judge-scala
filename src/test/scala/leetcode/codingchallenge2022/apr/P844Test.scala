package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P844Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "t", "expected"),
    ("a", "b", false),
    ("a", "a", true),
    ("ab#c", "ad#c", true),
    ("ab##", "c#d#", true),
    ("a#", "b##", true),
    ("a#c", "b", false),
    ("a#b", "b", true),
    ("aaabc", "aaa#bc", false)
  )

  test("Test of Backspace String Compare") {
    forAll(table) { (s, t, expected) =>
      P844.backspaceCompare(s, t) shouldBe expected
    }
  }
}
