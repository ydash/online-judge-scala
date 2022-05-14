package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P743Test extends LeetCodeSpec {
  private val table = Table(
    ("times", "n", "k", "expected"),
    (Array(Array(2, 1, 1), Array(2, 3, 1), Array(3, 4, 1)), 4, 2, 2),
    (Array(Array(1, 2, 1)), 2, 1, 1),
    (Array(Array(1, 2, 1)), 2, 2, -1)
  )

  test("Test of Network Delay Time") {
    forAll(table) { (times, n, k, expected) =>
      P743.networkDelayTime(times, n, k) shouldBe expected
    }
  }
}
