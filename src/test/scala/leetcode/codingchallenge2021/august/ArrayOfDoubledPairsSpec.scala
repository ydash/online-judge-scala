package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class ArrayOfDoubledPairsSpec extends LeetCodeSpec {
  private val table = Table(
    ("arr", "expected"),
    (Array.empty[Int], true),
    (Array(3, 1, 3, 6), false),
    (Array(4, -2, 2, -4), true),
    (Array(-1, 2, 4, 8), false),
    (Array(0, 1, 2, 0), true),
    (Array(1, 2, 4, 16, 8, 4), false),
    (Array(1, 2, 1, 2), true)
  )

  test("Test of Array of Doubled Pairs") {
    forAll(table) { (arr, expected) =>
      ArrayOfDoubledPairs.canReorderDoubled(arr) shouldBe expected
    }
  }
}
