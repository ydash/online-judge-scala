package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class ClimbingStairsSpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, 1),
    (2, 2),
    (3, 3),
    (45, 1836311903)
  )

  test("Test of Climbing Stairs") {
    forAll(table) { (n, expected) =>
      ClimbingStairs.climbStairs(n) shouldBe expected
    }
  }
}
