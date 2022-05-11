package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1641Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, 5),
    (2, 15),
    (33, 66045)
  )

  test("Test of Count Sorted Vowel Strings") {
    forAll(table) { (n, expected) =>
      P1641.countVowelStrings(n) shouldBe expected
    }
  }
}
