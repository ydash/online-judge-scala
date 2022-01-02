package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P312Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(42), 42),
    (Array(1, 5), 10),
    (Array(3, 1, 5, 8), 167),
    (Array(8, 3, 4, 3, 5, 0, 5, 6, 6, 2, 8, 5, 6, 2, 3, 8, 3, 5, 1, 0, 2), 3394)
  )

  test("Test of Burst Balloons") {
    forAll(table) { (nums, expected) =>
      P312.maxCoins(nums) shouldBe expected
    }
  }
}
