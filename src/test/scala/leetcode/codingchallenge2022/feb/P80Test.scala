package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P80Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(0), 1, Array(0)),
    (Array(0, 0), 2, Array(0, 0)),
    (Array(0, 0, 0), 2, Array(0, 0)),
    (Array(1, 1, 1, 2, 2, 3), 5, Array(1, 1, 2, 2, 3)),
    (Array(0, 0, 1, 1, 1, 1, 2, 3, 3), 7, Array(0, 0, 1, 1, 2, 3, 3))
  )

  test("Test of Remove Duplicated from Sorted Array II") {
    forAll(table) { (nums, k, expected) =>
      P80.removeDuplicates(nums) shouldBe k
      assert((0 until k).forall(i => nums(i) == expected(i)))
    }
  }
}
