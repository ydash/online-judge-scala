package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class IntersectionOfTwoArraysIISpec extends LeetCodeSpec {
  private val table = Table(
    ("nums1", "nums2", "expected"),
    (Array(1, 2, 2, 1), Array(2, 2), Array(2, 2)),
    (Array(4, 9, 5), Array(9, 4, 9, 8, 4), Array(4, 9)),
    (Array(1000, 999, 998), Array(0, 1, 2), Array())
  )

  test("Test of Intersection of Two Arrays II") {
    forAll(table) { (nums1, nums2, expected) =>
      IntersectionOfTwoArraysII.intersect(nums1, nums2) should contain theSameElementsAs expected
    }
  }
}
