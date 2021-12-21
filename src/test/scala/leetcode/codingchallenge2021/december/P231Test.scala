package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P231Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (1, true),
    (16, true),
    (3, false),
    (Int.MaxValue, false),
    (-2, false)
  )

  test("Test of Power of Two") {
    forAll(table) { (n, expected) =>
      P231.isPowerOfTwo(n) shouldBe expected
    }
  }
}
