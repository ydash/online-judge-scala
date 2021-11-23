package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P952Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(4, 6, 15, 35), 4),
    (Array(20, 50, 9, 63), 2),
    (Array(2, 3, 6, 7, 4, 12, 21, 39), 8)
  )

  test("Test of P952") {
    forAll(table) { (nums, expected) =>
      P952.largestComponentSize(nums) shouldBe expected
    }
  }
}
