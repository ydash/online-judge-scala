package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P413Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array.empty[Int], 0),
    (Array(1), 0),
    (Array(1, 2), 0),
    (Array(1, 2, 3, 4), 3),
    (Array(1, 2, 3, 4, 5, 6), 10)
  )

  test("Test of Arithmetic Slices") {
    forAll(table) { (nums, expected) =>
      P413.numberOfArithmeticSlices(nums) shouldBe expected
    }
  }
}
