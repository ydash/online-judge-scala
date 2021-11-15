package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class LargestDivisibleSubsetSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3), List(1, 2)),
    (Array(1, 2, 4, 8), List(1, 2, 4, 8))
  )

  test("Test of Largest Divisible Subset") {
    forAll(table) { (nums, expected) =>
      LargestDivisibleSubset.largestDivisibleSubset(nums) shouldBe expected
    }
  }
}
