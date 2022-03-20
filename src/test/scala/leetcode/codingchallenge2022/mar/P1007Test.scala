package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1007Test extends LeetCodeSpec {
  private val table = Table(
    ("tops", "bottoms", "expected"),
    (Array(2, 1, 2, 4, 2, 2), Array(5, 2, 6, 2, 3, 2), 2),
    (Array(3, 5, 1, 2, 3), Array(3, 6, 3, 3, 4), -1),
    (Array(1, 1), Array(2, 2), 0),
    (Array(1, 2), Array(3, 1), 1),
    (Array(4, 4, 6), Array(4, 5, 4), 1)
  )

  test("Test of Minimum Domino Rotations For Equal Row") {
    forAll(table) { (tops, bottoms, expected) =>
      P1007.minDominoRotations(tops, bottoms) shouldBe expected
    }
  }
}
