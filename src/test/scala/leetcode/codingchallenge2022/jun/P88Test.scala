package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P88Test extends LeetCodeSpec {
  private val table = Table(
    ("nums1", "m", "nums2", "n", "expected"),
    (Array(1, 2, 3, 0, 0, 0), 3, Array(2, 5, 6), 3, Array(1, 2, 2, 3, 5, 6)),
    (Array(1), 1, Array.empty[Int], 0, Array(1)),
    (Array(0), 0, Array(1), 1, Array(1))
  )

  test("Test of Merge Sorted Array") {
    forAll(table) { (nums1, m, nums2, n, expected) =>
      P88.merge(nums1, m, nums2, n)
      nums1 should contain theSameElementsInOrderAs expected
    }
  }
}
