package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P198Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3, 1), 4),
    (Array(2, 7, 9, 3, 1), 12)
  )

  test("Test of House Robber") {
    forAll(table) { (nums, expected) =>
      P198.rob(nums) shouldBe expected
    }
  }
}
