package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P454Test extends LeetCodeSpec {
  private val table = Table(
    ("nums1", "nums2", "nums3", "nums4", "expected"),
    (Array(1, 2), Array(-2, -1), Array(-1, 2), Array(0, 2), 2),
    (Array(0), Array(0), Array(0), Array(0), 1),
    (Array(-1, 1, 1, 1, -1), Array(0, -1, -1, 0, 1), Array(-1, -1, 1, -1, -1), Array(0, 1, 0, -1, -1), 132)
  )

  test("Test of 4Sum II") {
    forAll(table) { (nums1, nums2, nums3, nums4, expected) =>
      P454.fourSumCount(nums1, nums2, nums3, nums4) shouldBe expected
    }
  }
}
