package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P740Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(42), 42),
    (Array(3, 4, 2), 6),
    (Array(2, 2, 3, 3, 3, 4), 9),
    (Array(8, 10, 4, 9, 1, 3, 5, 9, 4, 10), 37),
    (Array(1, 2, 3, 15, 16, 17, 18), 38)
  )

  test("Test of Delete and Earn") {
    forAll(table) { (nums, expected) =>
      P740.deleteAndEarn(nums) shouldBe expected
    }
  }
}
