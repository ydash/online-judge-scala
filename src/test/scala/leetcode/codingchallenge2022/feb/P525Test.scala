package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P525Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(0, 1), 2),
    (Array(0, 1, 0), 2),
    (Array(0), 0),
    (Array(0, 1, 0, 0, 1, 0, 1, 0), 6),
    (Array(0, 0, 0, 1, 1, 1, 0), 6),
    (Array(0, 1, 1, 0, 1, 1, 1, 0), 4)
  )

  test("Test of Contiguous Array") {
    forAll(table) { (nums, expected) =>
      P525.findMaxLength(nums) shouldBe expected
    }
  }
}
