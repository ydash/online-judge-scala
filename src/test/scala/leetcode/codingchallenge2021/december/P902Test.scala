package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P902Test extends LeetCodeSpec {
  private val table = Table(
    ("digits", "n", "expected"),
    (Array("1", "3", "5", "7"), 100, 20),
    (Array("1", "4", "9"), 1000000000, 29523),
    (Array("7"), 8, 1),
    (Array("3"), 1, 0),
    (Array("3", "5", "7"), 5, 2),
    (Array("3", "5", "7"), 517, 21),
    (Array("3", "5", "7"), 76372137, 9111)
  )

  test("Test of Numbers At Most N Given Digit Set") {
    forAll(table) { (digits, n, expected) =>
      P902.atMostNGivenDigitSet(digits, n) shouldBe expected
    }
  }
}
