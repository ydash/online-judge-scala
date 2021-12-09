package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P1306Test extends LeetCodeSpec {
  private val table = Table(
    ("arr", "start", "expected"),
    (Array(4, 2, 3, 0, 3, 1, 2), 5, true),
    (Array(4, 2, 3, 0, 3, 1, 2), 0, true),
    (Array(3, 0, 2, 1, 2), 2, false)
  )

  test("Test of Jump Game III") {
    forAll(table) { (arr, start, expected) =>
      P1306.canReach(arr, start) shouldBe expected
    }
  }
}
