package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class TwoSumTest extends LeetCodeSpec {
  test("Test of Two Sum") {
    forAll(
      Table(
        ("nums", "target", "expected"),
        (Array(2, 7, 11, 15), 9, Array(0, 1)),
        (Array(3, 2, 4), 6, Array(1, 2)),
        (Array(3, 3), 6, Array(0, 1))
      )
    ) { (nums, target, expected) =>
      TwoSum.twoSum(nums, target).mkString(",") shouldBe expected.mkString(",")
    }
  }
}
