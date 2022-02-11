package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P567Test extends LeetCodeSpec {
  private val table = Table(
    ("s1", "s2", "expected"),
    ("a", "b", false),
    ("a", "a", true),
    ("ab", "eidbaooo", true),
    ("ab", "eidboaoo", false),
    ("abc", "abdecbax", true),
    ("adc", "dcda", true),
    ("hello", "ooolleoooleh", false),
    ("hello", "ollelho", true)
  )

  test("Test of Permutation in String") {
    forAll(table) { (s1, s2, expected) =>
      P567.checkInclusion(s1, s2) shouldBe expected
    }
  }
}
