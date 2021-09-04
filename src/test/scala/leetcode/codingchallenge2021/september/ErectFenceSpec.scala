package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ErectFenceSpec extends LeetCodeSpec {
  private val table = Table(
    ("points", "expected"),
    (
      Array(Array(1, 1), Array(2, 2), Array(2, 0), Array(2, 4), Array(3, 3), Array(4, 2)),
      Array(Array(1, 1), Array(2, 0), Array(3, 3), Array(2, 4), Array(4, 2))
    ),
    (
      Array(Array(1, 2), Array(2, 2), Array(4, 2)),
      Array(Array(4, 2), Array(2, 2), Array(1, 2))
    ),
    (
      Array(Array(0, 0), Array(0, 1), Array(0, 2), Array(1, 2), Array(2, 2), Array(2, 1), Array(2, 0), Array(1, 0)),
      Array(Array(0, 0), Array(0, 1), Array(0, 2), Array(1, 2), Array(2, 2), Array(2, 1), Array(2, 0), Array(1, 0))
    ),
    (
      Array(Array(3, 7), Array(6, 8), Array(7, 8), Array(11, 10), Array(4, 3), Array(8, 5), Array(7, 13), Array(4, 13)),
      Array(Array(4, 13), Array(4, 3), Array(3, 7), Array(8, 5), Array(11, 10), Array(7, 13))
    ),
    (
      Array(
        Array(5, 5),
        Array(4, 8),
        Array(1, 3),
        Array(5, 9),
        Array(3, 0),
        Array(0, 4),
        Array(3, 2),
        Array(8, 9),
        Array(9, 3)
      ),
      Array(Array(9, 3), Array(5, 9), Array(4, 8), Array(3, 0), Array(0, 4), Array(8, 9))
    )
  )

  test("Test of Erect the Fence") {
    forAll(table) { (points, expected) =>
      ErectFence.outerTrees(points) should contain theSameElementsAs expected
    }
  }
}
