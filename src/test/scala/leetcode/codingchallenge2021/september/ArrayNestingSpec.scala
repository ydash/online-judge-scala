package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ArrayNestingSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(0), 1),
    (Array(0, 1, 2), 1),
    (Array(5, 4, 0, 3, 1, 6, 2), 4)
  )

  test("Test of Array Nesting") {
    forAll(table) { (nums, expected) =>
      ArrayNesting.arrayNesting(nums) shouldBe expected
    }
  }
}
