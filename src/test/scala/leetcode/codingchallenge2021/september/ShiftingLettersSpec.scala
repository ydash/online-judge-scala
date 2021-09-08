package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ShiftingLettersSpec extends LeetCodeSpec {

  test("Test of Shifting Letters") {
    val table = Table(
      ("s", "shifts", "expected"),
      ("abc", Array(3, 5, 9), "rpl"),
      ("a", Array(1e9.toInt), "m"),
      ("aaa", Array(1e9.toInt, 1e9.toInt, 1e9.toInt), "kym")
    )
    forAll(table) { (s, shifts, expected) =>
      ShiftingLetters.shiftingLetters(s, shifts) shouldBe expected
    }
  }
}
