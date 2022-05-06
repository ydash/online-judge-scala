package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1209Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "k", "expected"),
    ("abcd", 2, "abcd"),
    ("deeedbbcccbdaa", 3, "aa"),
    ("pbbcggttciiippooaais", 2, "ps")
  )

  test("Test of Remove All Adjacent Duplicates in String II") {
    forAll(table) { (s, k, expected) =>
      P1209.removeDuplicates(s, k) shouldBe expected
    }
  }
}
