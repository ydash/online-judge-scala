package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P973Test extends LeetCodeSpec {
  private val table = Table(
    ("points", "k", "expected"),
    (Array(Array(1, 3), Array(-2, 2)), 1, Array(Array(-2, 2))),
    (Array(Array(3, 3), Array(5, -1), Array(-2, 4)), 2, Array(Array(3, 3), Array(-2, 4)))
  )

  test("Test of K Closest Points to Origin") {
    forAll(table) { (points, k, expected) =>
      P973.kClosest(points, k) shouldBe expected
    }
  }
}
