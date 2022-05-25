package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P354Test extends LeetCodeSpec {
  private val table = Table(
    ("envelopes", "expected"),
    (Array(Array(5, 4), Array(6, 4), Array(6, 7), Array(2, 3)), 3),
    (Array(Array(1, 1), Array(1, 1), Array(1, 1)), 1),
    (Array(Array(4, 5), Array(4, 6), Array(6, 7), Array(2, 3), Array(1, 1), Array(1, 1)), 4)
  )

  test("Test of Russian Doll Envelopes") {
    forAll(table) { (envelopes, expected) =>
      P354.maxEnvelopes(envelopes) shouldBe expected
    }
  }
}
