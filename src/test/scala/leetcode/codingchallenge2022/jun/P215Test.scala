package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P215Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(3, 2, 1, 5, 6, 4), 2, 5),
    (Array(3, 2, 3, 1, 2, 4, 5, 5, 6), 4, 4)
  )

  test("Test of Kth Largest Element in an Array") {
    forAll(table) { (nums, k, expected) =>
      P215.findKthLargest(nums, k) shouldBe expected
    }
  }
}
