package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P35Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "target", "expected"),
    (Array(0), -1, 0),
    (Array(0), 1, 1),
    (Array(1, 3, 5, 6), 5, 2),
    (Array(1, 3, 5, 6), 2, 1),
    (Array(1, 3, 5, 6), 7, 4),
    (Array(1, 3, 5, 6), 0, 0)
  )

  test("Test of Search Insert Position") {
    forAll(table) { (nums, target, expected) =>
      P35.searchInsert(nums, target) shouldBe expected
    }
  }
}
