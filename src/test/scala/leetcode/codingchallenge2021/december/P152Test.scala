package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P152Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(-1), -1),
    (Array(3), 3),
    (Array(-1, 0), 0),
    (Array(-1, 3), 3),
    (Array(2, 3, -2, 4), 6),
    (Array(-2, 0, -1), 0),
    (Array(-1, 3, -2, 8, -2), 96),
    (Array(3, 0, 3), 3)
  )

  test("Test of Maximum Product Subarray") {
    forAll(table) { (nums, expected) =>
      P152.maxProduct(nums) shouldBe expected
    }
  }
}
