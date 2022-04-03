package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P31Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1), Array(1)),
    (Array(1, 2, 3), Array(1, 3, 2)),
    (Array(1, 3, 2), Array(2, 1, 3)),
    (Array(2, 1, 3), Array(2, 3, 1)),
    (Array(2, 3, 1), Array(3, 1, 2)),
    (Array(3, 1, 2), Array(3, 2, 1)),
    (Array(3, 2, 1), Array(1, 2, 3)),
    (Array(1, 1, 5), Array(1, 5, 1)),
    (Array(1, 5, 1), Array(5, 1, 1)),
    (Array(5, 1, 1), Array(1, 1, 5)),
    (Array(1, 2, 3, 4, 5), Array(1, 2, 3, 5, 4)),
    (Array(1, 2, 3, 5, 4), Array(1, 2, 4, 3, 5)),
    (Array(1, 2, 3, 5, 4), Array(1, 2, 4, 3, 5)),
    (Array(1, 2, 4, 3, 5), Array(1, 2, 4, 5, 3)),
    (Array(1, 2, 4, 5, 3), Array(1, 2, 5, 3, 4)),
    (Array(1, 2, 5, 3, 4), Array(1, 2, 5, 4, 3)),
    (Array(1, 2, 5, 4, 3), Array(1, 3, 2, 4, 5)),
  )

  test("Test of Next Permutation") {
    forAll(table) { (nums, expected) =>
      P31.nextPermutation(nums)
      nums.sameElements(expected) shouldBe true
    }
  }
}
