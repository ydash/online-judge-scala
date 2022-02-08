package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P258Test extends LeetCodeSpec {
  private val table = Table(
    ("num", "expected"),
    (1, 1),
    (42, 6),
    (38, 2),
    (138, 3)
  )

  test("Test of Add Digits") {
    forAll(table) { (num, expected) =>
      P258.addDigits(num) shouldBe expected
    }
  }
}
