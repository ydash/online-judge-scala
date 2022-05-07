package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P456Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3, 4), false),
    (Array(3, 1, 4, 2), true),
    (Array(-1, 3, 2, 0), true)
  )

  test("Test of 132 Pattern") {
    forAll(table) { (nums, expected) =>
      P456.find132pattern(nums) shouldBe expected
    }
  }
}
