package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P191Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (0, 0),
    (11, 3),
    (128, 1),
    (-3, 31),
    (Int.MinValue, 1),
    (Int.MaxValue, 31)
  )

  test("Test of Number of 1 Bits") {
    forAll(table) { (n, expected) =>
      P191.hammingWeight(n) shouldBe expected
    }
  }
}
