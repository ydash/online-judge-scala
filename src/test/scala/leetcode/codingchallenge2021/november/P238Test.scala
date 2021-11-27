package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P238Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(0, 0), Array(0, 0)),
    (Array(1, 2), Array(2, 1)),
    (Array(1, 2, 3, 4), Array(24, 12, 8, 6)),
    (Array(-1, 1, 0, -3, 3), Array(0, 0, 9, 0, 0))
  )

  test("Test of Product of Array Except Self") {
    forAll(table) { (nums, expected) =>
      P238.productExceptSelf(nums) shouldBe expected
    }
  }
}
