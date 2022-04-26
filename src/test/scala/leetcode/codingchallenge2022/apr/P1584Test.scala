package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1584Test extends LeetCodeSpec {
  private val table = Table(
    ("points", "expected"),
    (Array(Array(0, 0), Array(2, 2), Array(3, 10), Array(5, 2), Array(7, 0)), 20),
    (Array(Array(3, 12), Array(-2, 5), Array(-4, 1)), 18)
  )

  test("Test of Min Cost to Connect All Points") {
    forAll(table) { (points, expected) =>
      P1584.minCostConnectPoints(points) shouldBe expected
    }
  }
}
