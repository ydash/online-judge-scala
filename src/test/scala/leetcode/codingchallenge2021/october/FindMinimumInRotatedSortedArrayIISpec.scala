package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class FindMinimumInRotatedSortedArrayIISpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 3, 5), 1),
    (Array(2, 2, 2, 0, 1), 0),
    (Array(2, 0, 1, 1, 1, 1, 1, 1), 0),
    (Array(3, 3, 1, 3), 1)
  )

  test("Test of Find Minimum in Rotated Sorted Array II") {
    forAll(table) { (nums, expected) =>
      FindMinimumInRotatedSortedArrayII.findMin(nums) shouldBe expected
    }
  }
}
