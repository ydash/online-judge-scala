package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P171Test extends LeetCodeSpec {
  private val table = Table(
    ("columnTitle", "expected"),
    ("A", 1),
    ("B", 2),
    ("AB", 28),
    ("ZY", 701),
    ("FXSHRXW", 2147483647)
  )

  test("Test of Excel Sheet Column Number") {
    forAll(table) { (columnTitle, expected) =>
      P171.titleToNumber(columnTitle) shouldBe expected
    }
  }
}
