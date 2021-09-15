package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class LongestTurbulentSubarraySpec extends LeetCodeSpec {
  private val table = Table(
    ("arr", "expected"),
    (Array(100), 1),
    (Array(1, 1, 1, 1, 1), 1),
    (Array(4, 8, 12, 16), 2),
    (Array(9, 4, 2, 10, 7, 8, 8, 1, 9), 5),
    (Array(0, 8, 45, 88, 48, 68, 28, 55, 17, 24), 8),
    (Array(0, 1, 0, 1, 1), 4)
  )

  test("Test Longest Turbulent Subarray") {
    forAll(table) { (arr, expected) =>
      LongestTurbulentSubarray.maxTurbulenceSize(arr) shouldBe expected
    }
  }
}
