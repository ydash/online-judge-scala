package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class MinimumValueToGetPositiveStepByStepSumSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(-3, 2, -3, 4, 2), 5),
    (Array(1, 2), 1),
    (Array(1, -2, -3), 5)
  )

  test("Test of Minimum Value to Get Positive Step by Step Sum") {
    forAll(table) { (nums, expected) =>
      MinimumValueToGetPositiveStepByStepSum.minStartValue(nums) shouldBe expected
    }
  }
}
