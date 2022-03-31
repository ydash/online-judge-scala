package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P410Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "m", "expected"),
    (Array(7, 2, 5, 10, 8), 2, 18),
    (Array(1, 2, 3, 4, 5), 2, 9),
    (Array(1, 4, 4), 3, 4),
    (Array(1, 1, 1, 10, 10, 10, 1, 1, 1), 3, 13)
  )

  test("Test of Split Array Largest Sum") {
    forAll(table) { (nums, m, expected) =>
      P410.splitArray(nums, m) shouldBe expected
    }
  }
}
