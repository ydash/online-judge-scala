package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P402Test extends LeetCodeSpec {
  private val table = Table(
    ("num", "k", "expected"),
    ("123", 1, "12"),
    ("321", 1, "21"),
    ("1432219", 3, "1219"),
    ("10200", 1, "200"),
    ("10", 2, "0")
  )

  test("Test of Remove K Digits") {
    forAll(table) { (num, k, expected) =>
      P402.removeKdigits(num, k) shouldBe expected
    }
  }
}
