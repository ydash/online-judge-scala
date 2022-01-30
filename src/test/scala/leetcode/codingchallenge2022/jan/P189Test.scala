package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P189Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(1, 2, 3, 4, 5, 6, 7), 3, Array(5, 6, 7, 1, 2, 3, 4)),
    (Array(-1, -100, 3, 99), 2, Array(3, 99, -1, -100)),
    (Array(1, 2, 3), 0, Array(1, 2, 3)),
    (Array(1), 1, Array(1)),
    (Array(1, 2, 3), 3, Array(1, 2, 3)),
    (Array(1, 2, 3, 4, 5, 6), 2, Array(5, 6, 1, 2, 3, 4)),
    (Array(1, 2, 3, 4, 5, 6), 3, Array(4, 5, 6, 1, 2, 3)),
    (Array(1, 2, 3, 4, 5, 6), 4, Array(3, 4, 5, 6, 1, 2)),
    (Array(1, 2, 3, 4, 5, 6), 8, Array(5, 6, 1, 2, 3, 4))
  )

  test("Test of Rotate Array") {
    forAll(table) { (nums, k, expected) =>
      P189.rotate(nums, k)
      nums shouldBe expected
    }
  }
}
