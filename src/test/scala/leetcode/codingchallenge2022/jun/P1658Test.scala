package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1658Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "x", "expected"),
    (Array(1, 1, 4, 2, 3), 5, 2),
    (Array(5, 6, 7, 8, 9), 4, -1),
    (Array(3, 2, 20, 1, 1, 3), 10, 5),
    (Array(1, 1), 3, -1),
    (Array(1, 1, 1), 3, 3)
  )

  test("Test of Minimum Operations to Reduce X to Zero") {
    forAll(table) { (nums, x, expected) =>
      P1658.minOperations(nums, x) shouldBe expected
    }
  }
}
