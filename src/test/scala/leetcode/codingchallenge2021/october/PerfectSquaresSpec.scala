package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class PerfectSquaresSpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (12, 3),
    (13, 2),
    (4, 1)
  )

  test("Test of Perfect Squares") {
    forAll(table) { (n, expected) =>
      PerfectSquares.numSquares(n) shouldBe expected
    }
  }
}
