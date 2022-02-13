package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P78Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(0), List(List(), List(0))),
    (Array(1, 2, 3), List(List(), List(1), List(2), List(1, 2), List(3), List(1, 3), List(2, 3), List(1, 2, 3)))
  )

  test("Test of Subsets") {
    forAll(table) { (nums, expected) =>
      P78.subsets(nums).map(_.sorted) should contain theSameElementsAs expected
    }
  }
}
