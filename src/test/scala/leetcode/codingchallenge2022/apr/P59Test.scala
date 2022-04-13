package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P59Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, Array(Array(1))),
    (2, Array(Array(1, 2), Array(4, 3))),
    (3, Array(Array(1, 2, 3), Array(8, 9, 4), Array(7, 6, 5))),
    (4, Array(Array(1, 2, 3, 4), Array(12, 13, 14, 5), Array(11, 16, 15, 6), Array(10, 9, 8, 7))),
    (
      5,
      Array(
        Array(1, 2, 3, 4, 5),
        Array(16, 17, 18, 19, 6),
        Array(15, 24, 25, 20, 7),
        Array(14, 23, 22, 21, 8),
        Array(13, 12, 11, 10, 9)
      )
    )
  )

  test("Test of Spiral Matrix II") {
    forAll(table) { (n, expected) =>
      P59.generateMatrix(n) shouldBe expected
    }
  }
}
