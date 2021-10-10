package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class BitwiseAndOfNumbersRangeSpec extends LeetCodeSpec {
  private val table = Table(
    ("left", "right", "expected"),
    (5, 7, 4),
    (0, 0, 0),
    (1, 2147483647, 0),
    (2, 6, 0),
    (3, 3, 3),
    (6, 7, 6)
  )

  test("Test of Bitwise AND of Numbers Range") {
    forAll(table) { (left, right, expected) =>
      BitwiseAndOfNumbersRange.rangeBitwiseAnd(left, right) shouldBe expected
    }
  }
}
