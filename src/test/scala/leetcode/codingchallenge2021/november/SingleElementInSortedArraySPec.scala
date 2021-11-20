package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class SingleElementInSortedArraySPec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 1, 2, 3, 3, 4, 4, 8, 8), 2),
    (Array(3, 3, 7, 7, 10, 11, 11), 10),
    (Array(1, 1, 2, 2, 3, 3, 4, 4, 8), 8),
    (Array(1, 2, 2, 3, 3, 4, 4, 8, 8), 1)
  )

  test("Test of Single Element in a Sorted Array") {
    forAll(table) { (nums, expected) =>
      SingleElementInSortedArray.singleNonDuplicate(nums) shouldBe expected
    }
  }
}
