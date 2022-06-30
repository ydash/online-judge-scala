package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P462Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3), 2),
    (Array(1, 10, 2, 9), 16),
    (Array(1, 0, 0, 8, 6), 14)
  )

  test("Test of Minimum Moves to Equal Array Elements II") {
    forAll(table) { (nums, expected) =>
      P462.minMoves2(nums) shouldBe expected
    }
  }
}
