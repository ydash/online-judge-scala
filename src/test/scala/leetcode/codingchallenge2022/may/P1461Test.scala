package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1461Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "k", "expected"),
    ("00110110", 2, true),
    ("0", 1, false),
    ("0110", 1, true),
    ("0110", 2, false),
    ("00110", 2, true)
  )

  test("Test of Check If a String Contains All Binary Codes of Size K") {
    forAll(table) { (s, k, expected) =>
      P1461.hasAllCodes(s, k) shouldBe expected
    }
  }
}
