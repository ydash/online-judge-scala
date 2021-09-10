package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ArithmeticSlicesIISpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(2, 4, 6, 8, 10), 7),
    (Array(7, 7, 7, 7, 7), 16),
    (Array(0, 2000000000, -294967296), 0),
    (Array(2000000000, -294967296, 1705032704), 0),
    (Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 67108512)
  )
  test("Test of Arithmetic Slices II") {
    forAll(table) { (nums, expected) =>
      ArithmeticSlicesII.numberOfArithmeticSlices(nums) shouldBe expected
    }
  }
}
