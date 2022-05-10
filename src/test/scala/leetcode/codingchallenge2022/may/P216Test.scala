package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P216Test extends LeetCodeSpec {
  private val table = Table(
    ("k", "n", "expected"),
    (3, 7, List(List(1, 2, 4))),
    (3, 9, List(List(1, 2, 6), List(1, 3, 5), List(2, 3, 4))),
    (4, 1, List.empty[List[Int]])
  )

  test("Test of Combination Sum III") {
    forAll(table) { (k, n, expected) =>
      P216.combinationSum3(k, n).map(_.sorted) shouldBe expected
    }
  }
}
