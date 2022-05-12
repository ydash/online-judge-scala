package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P46Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3), List(List(1, 2, 3), List(1, 3, 2), List(2, 1, 3), List(2, 3, 1), List(3, 1, 2), List(3, 2, 1))),
    (Array(0, 1), List(List(0, 1), List(1, 0))),
    (Array(1), List(List(1)))
  )

  test("Test of Permutations") {
    forAll(table) { (nums, expected) =>
      P46.permute(nums) should contain theSameElementsAs expected
    }
  }
}
