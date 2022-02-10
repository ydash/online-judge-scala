package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P560Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(1), 1, 1),
    (Array(1, 1, 1), 2, 2),
    (Array(1, 2, 3), 3, 2),
    (Array(1, 2, 3, 4, 5), 42, 0),
    (Array(1, 2, 3, 4, 5, -16), -1, 1)
  )

  test("Test of Subarray Sum Equals K") {
    forAll(table) { (nums, k, expected) =>
      P560.subarraySum(nums, k) shouldBe expected
    }
  }
}
