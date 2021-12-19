package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P394Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("3[a]2[bc]", "aaabcbc"),
    ("2[abc]3[cd]ef", "abcabccdcdcdef"),
    ("abc3[cd]xyz", "abccdcdcdxyz"),
    ("3[a2[c]]", "accaccacc")
  )

  test("Test of Decode String") {
    forAll(table) { (s, expected) =>
      P394.decodeString(s) shouldBe expected
    }
  }
}
