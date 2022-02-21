package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P169Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(42), 42),
    (Array(42, 42), 42),
    (Array(3, 2, 3), 3),
    (Array(2, 2, 1, 1, 1, 2, 2), 2)
  )

  test("Test of Majority Element") {
    forAll(table) { (nums, expected) =>
      P169.majorityElement(nums) shouldBe expected
    }
  }
}
