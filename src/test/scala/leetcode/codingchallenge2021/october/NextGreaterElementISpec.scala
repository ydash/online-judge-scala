package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class NextGreaterElementISpec extends LeetCodeSpec {
  private val table = Table(
    ("nums1", "nums2", "expected"),
    (Array(4, 1, 2), Array(1, 3, 4, 2), Array(-1, 3, -1)),
    (Array(2, 4), Array(1, 2, 3, 4), Array(3, -1))
  )

  test("Test of Next Greater Element") {
    forAll(table) { (nums1, nums2, expected) =>
      NextGreaterElementI.nextGreaterElement(nums1, nums2) shouldBe expected
    }
  }
}
