package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P665Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(4, 2, 3), true),
    (Array(4, 2, 1), false),
    (Array(2, 3, 4, 5, 1, 2), false),
    (Array(1, 2, 3, 1, 4), true),
    (Array(1, 3, 1, 4, 2), false)
  )

  test("Test of Non-decreasing Array") {
    forAll(table) { (nums, expected) =>
      P665.checkPossibility(nums) shouldBe expected
    }
  }
}
