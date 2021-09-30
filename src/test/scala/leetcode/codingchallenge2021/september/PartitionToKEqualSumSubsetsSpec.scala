package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class PartitionToKEqualSumSubsetsSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(4, 3, 2, 3, 5, 2, 1), 4, true),
    (Array(1, 2, 3, 4), 3, false),
    (Array(3522, 181, 521, 515, 304, 123, 2512, 312, 922, 407, 146, 1932, 4037, 2646, 3871, 269), 5, true),
    (Array(709, 374, 1492, 1279, 2848, 6337, 365, 1923, 739, 1904, 1938, 4627, 1106, 5885, 1202), 4, true)
  )

  test("Test of Partition to K Equal Sum Subsets") {
    forAll(table) { (nums, k, expected) =>
      PartitionToKEqualSumSubsets.canPartitionKSubsets(nums, k) shouldBe expected
    }
  }
}
