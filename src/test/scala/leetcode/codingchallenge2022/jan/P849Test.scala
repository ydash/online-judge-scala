package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P849Test extends LeetCodeSpec {
  private val table = Table(
    ("seats", "expected"),
    (Array(1, 0, 0, 0, 1, 0, 1), 2),
    (Array(1, 0, 0, 0), 3),
    (Array(0, 1), 1),
    (Array(1, 0, 0, 1, 0, 0, 0), 3)
  )

  test("Test of Maximize Distance to Closest Person") {
    forAll(table) { (seats, expected) =>
      P849.maxDistToClosest(seats) shouldBe expected
    }
  }
}
