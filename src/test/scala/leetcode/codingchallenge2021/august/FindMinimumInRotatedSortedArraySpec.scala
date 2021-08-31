package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class FindMinimumInRotatedSortedArraySpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(42), 42),
    (Array(0, 1), 0),
    (Array(1, 0), 0),
    (Array(0, 1, 2), 0),
    (Array(1, 2, 0), 0),
    (Array(2, 0, 1), 0),
    (Array(0, 1, 2, 3), 0),
    (Array(1, 2, 3, 0), 0),
    (Array(2, 3, 0, 1), 0),
    (Array(3, 0, 1, 2), 0),
    (Array(0, 1, 2, 3, 4), 0),
    (Array(1, 2, 3, 4, 0), 0),
    (Array(2, 3, 4, 0, 1), 0),
    (Array(3, 4, 0, 1, 2), 0),
    (Array(4, 0, 1, 2, 3), 0)
  )

  test("test") {
    forAll(table) { (nums, expected) =>
      FindMinimumInRotatedSortedArray.findMin(nums) shouldBe expected
    }
  }
}
