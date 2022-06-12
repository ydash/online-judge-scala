package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1695Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(4, 2, 4, 5, 6), 17),
    (Array(5, 2, 1, 2, 5, 2, 1, 2, 5), 8),
    (Array(1), 1),
    (Array(2, 2, 2, 2), 2),
    (Array(1, 1, 2, 2), 3)
  )

  test("Test of Maximum Erasure Value") {
    forAll(table) { (nums, expected) =>
      P1695.maximumUniqueSubarray(nums) shouldBe expected
    }
  }
}
