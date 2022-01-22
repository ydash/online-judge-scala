package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1510Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, true),
    (2, false),
    (4, true),
    (7, false)
  )

  test("Test of Stone Game IV") {
    forAll(table) { (n, expected) =>
      P1510.winnerSquareGame(n) shouldBe expected
    }
  }
}
