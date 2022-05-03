package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P581Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(2, 6, 4, 8, 10, 9, 15), 5),
    (Array(1, 2, 3, 4), 0),
    (Array(1), 0)
  )

  test("Test of Shortest Unsorted Continuous Subarray") {
    forAll(table) { (nums, expected) =>
      P581.findUnsortedSubarray(nums) shouldBe expected
    }
  }
}
