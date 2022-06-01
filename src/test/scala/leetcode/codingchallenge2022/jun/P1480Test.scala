package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1480Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3, 4), Array(1, 3, 6, 10)),
    (Array(1, 1, 1, 1, 1), Array(1, 2, 3, 4, 5)),
    (Array(3, 1, 2, 10, 1), Array(3, 4, 6, 16, 17))
  )

  test("Test of Running Sum of 1d Array") {
    forAll(table) { (nums, expected) =>
      P1480.runningSum(nums) shouldBe expected
    }
  }
}
