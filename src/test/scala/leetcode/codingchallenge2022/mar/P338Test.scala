package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P338Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (0, Array(0)),
    (1, Array(0, 1)),
    (2, Array(0, 1, 1)),
    (3, Array(0, 1, 1, 2)),
    (5, Array(0, 1, 1, 2, 1, 2)),
    (10, Array(0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2))
  )

  test("Test of Counting Bits") {
    forAll(table) { (n, expected) =>
      P338.countBits(n) should contain theSameElementsInOrderAs expected
    }
  }
}
