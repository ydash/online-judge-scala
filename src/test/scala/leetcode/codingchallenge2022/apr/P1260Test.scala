package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1260Test extends LeetCodeSpec {
  private val table = Table(
    ("grid", "k", "expected"),
    (Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9)), 1, List(List(9, 1, 2), List(3, 4, 5), List(6, 7, 8))),
    (
      Array(Array(3, 8, 1, 9), Array(19, 7, 2, 5), Array(4, 6, 11, 10), Array(12, 0, 21, 13)),
      4,
      List(List(12, 0, 21, 13), List(3, 8, 1, 9), List(19, 7, 2, 5), List(4, 6, 11, 10))
    ),
    (Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9)), 9, List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))),
    (
      Array(Array(1), Array(2), Array(3), Array(4), Array(7), Array(6), Array(5)),
      23,
      List(List(6), List(5), List(1), List(2), List(3), List(4), List(7))
    )
  )

  test("Test of Shift 2D Grid") {
    forAll(table) { (grid, k, expected) =>
      P1260.shiftGrid(grid, k) shouldBe expected
    }
  }
}
