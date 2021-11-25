package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P53Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(-2, -1, -3, 4, -1, 2, 1, -5, 4), 6),
    (Array(1), 1),
    (Array(-2, -1), -1)
  )

  test("Test of Maximum Subarray") {
    forAll(table) { (nums, expected) =>
      P53.maxSubArray(nums) shouldBe expected
    }
  }
}
