package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1679Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(1), 1, 0),
    (Array(1, 2, 3, 4), 5, 2),
    (Array(3, 1, 3, 4, 3), 6, 1)
  )

  test("Test of Max Number of K-Sum Pairs") {
    forAll(table) { (nums, k, expected) =>
      P1679.maxOperations(nums, k) shouldBe expected
    }
  }
}
