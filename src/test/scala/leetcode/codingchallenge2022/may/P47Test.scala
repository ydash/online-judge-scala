package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P47Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 1, 2), List(List(1, 1, 2), List(1, 2, 1), List(2, 1, 1))),
    (Array(1, 2, 3), List(List(1, 2, 3), List(1, 3, 2), List(2, 1, 3), List(2, 3, 1), List(3, 1, 2), List(3, 2, 1)))
  )

  test("Test of Permutations II") {
    forAll(table) { (nums, expected) =>
      P47.permuteUnique(nums) should contain theSameElementsAs expected
    }
  }
}
