package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class MaxConsecutiveOnesSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 1, 0, 1, 1, 1), 3),
    (Array(1, 0, 1, 1, 0, 1), 2),
    (Array(0, 0, 0, 0, 0), 0),
    (Array(1, 1, 0, 0, 1), 2)
  )

  test("Test of Max Consecutive Ones") {
    forAll(table) { (nums, expected) =>
      MaxConsecutiveOnes.findMaxConsecutiveOnes(nums) shouldBe expected
    }
  }
}
