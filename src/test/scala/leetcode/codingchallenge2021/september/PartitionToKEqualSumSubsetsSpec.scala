package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class PartitionToKEqualSumSubsetsSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(4, 3, 2, 3, 5, 2, 1), 4, true),
    (Array(1, 2, 3, 4), 3, false)
  )

  test("Test of Partition to K Equal Sum Subsets") {
    forAll(table) { (nums, k, expected) =>
      PartitionToKEqualSumSubsets.canPartitionKSubsets(nums, k) shouldBe expected
    }
  }
}
