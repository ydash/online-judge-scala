package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P316Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("a", "a"),
    ("cab", "cab"),
    ("cabc", "abc"),
    ("bcabc", "abc"),
    ("cbacdcbc", "acdb"),
    ("abacb", "abc"),
    ("cbacdebdc", "acdeb")
  )

  test("Test of Remove Duplicate Letters") {
    forAll(table) { (s, expected) =>
      P316.removeDuplicateLetters(s) shouldBe expected
    }
  }
}
