package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class SubsetsIISpec extends LeetCodeSpec {

  test("Test of Subsets II") {
    val table = Table(
      ("nums", "expected"),
      (Array(1, 2, 2), List(List(), List(1), List(1, 2), List(1, 2, 2), List(2), List(2, 2))),
      (Array(0), List(List(), List(0)))
    )
    forAll(table) { (nums, expected) =>
      SubSetsII.subsetsWithDup(nums) should contain theSameElementsAs expected
    }
  }
}
