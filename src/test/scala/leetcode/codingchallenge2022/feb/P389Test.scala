package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P389Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "t", "expected"),
    ("", "a", 'a'),
    ("abcd", "abcde", 'e'),
    ("adjc", "ackjd", 'k')
  )

  test("Test of Find the Difference") {
    forAll(table) { (s, t, expected) =>
      P389.findTheDifference(s, t) shouldBe expected
    }
  }
}
