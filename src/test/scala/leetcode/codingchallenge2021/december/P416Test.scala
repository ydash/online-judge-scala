package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P416Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 5, 11, 5), true),
    (Array(1, 2, 3, 5), false),
    (Array(1, 2, 3), true),
    (Array(1, 2, 2, 1), true)
  )

  test("Test of Partition Equal Subset Sum") {
    forAll(table) { (nums, expected) =>
      P416.canPartition(nums) shouldBe expected
    }
  }
}
