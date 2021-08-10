package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class FlipString2MonotoneIncreasingSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("00110", 1),
    ("010110", 2),
    ("00011000", 2),
    ("11100111", 2)
  )

  test("Test of Flip String to Monotone Increasing") {
    forAll(table) { (s, expected) =>
      FlipString2MonotoneIncreasing.minFlipsMonoIncr(s) shouldBe expected
    }
  }
}
