package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P532Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(1), 42, 0),
    (Array(0, 42), 42, 1),
    (Array(3, 1, 4, 1, 5), 2, 2),
    (Array(1, 3, 1, 5, 4), 0, 1),
    (Array(1, 2, 4, 4, 3, 3, 0, 9, 2, 3), 3, 2)
  )

  test("Test of K-diff Pairs in an Array") {
    forAll(table) { (nums, k, expected) =>
      P532.findPairs(nums, k) shouldBe expected
    }
  }
}
