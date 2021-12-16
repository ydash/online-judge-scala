package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P310Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "edges", "expected"),
    (1, Array[Array[Int]](), List(0)),
    (2, Array(Array(0, 1)), List(0, 1)),
    (4, Array(Array(1, 0), Array(1, 2), Array(1, 3)), List(1)),
    (6, Array(Array(3, 0), Array(3, 1), Array(3, 2), Array(3, 4), Array(5, 4)), List(3, 4)),
    (
      10,
      Array(
        Array(0, 1),
        Array(0, 2),
        Array(0, 3),
        Array(2, 4),
        Array(0, 5),
        Array(5, 6),
        Array(6, 7),
        Array(2, 8),
        Array(7, 9)
      ),
      List(5)
    )
  )

  test("Test of Minimum Height Trees") {
    forAll(table) { (n, edges, expected) =>
      P310.findMinHeightTrees(n, edges) should contain theSameElementsAs expected
    }
  }
}
