package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P39Test extends LeetCodeSpec {
  private val table = Table(
    ("candidates", "target", "expected"),
    (Array(1), 1, List(List(1))),
    (Array(2), 1, Nil),
    (Array(2, 3, 6, 7), 7, List(List(2, 2, 3), List(7))),
    (Array(5, 3, 2), 8, List(List(2, 2, 2, 2), List(2, 3, 3), List(3, 5)))
  )

  test("Test of Combination Sum") {
    forAll(table) { (candidates, target, expected) =>
      P39.combinationSum(candidates, target).map(_.sorted) should contain theSameElementsAs expected
    }
  }
}
