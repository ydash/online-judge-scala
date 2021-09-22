package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class MaximumLengthOfAConcatenatedStringWithUniqueCharactersSpec extends LeetCodeSpec {
  private val table = Table(
    ("lst", "expected"),
    (List("abc", "abd"), 3),
    (List("un", "iq", "ue"), 4),
    (List("cha", "r", "act", "ers"), 6),
    (List("abcdefghijklmnopqrstuvwxyz"), 26),
    (List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"), 16)
  )

  test("Test of Maximum Length of a Concatenated String with Unique Characters") {
    forAll(table) { (lst, expected) =>
      MaximumLengthOfAConcatenatedStringWithUniqueCharacters.maxLength(lst) shouldBe expected
    }
  }
}
