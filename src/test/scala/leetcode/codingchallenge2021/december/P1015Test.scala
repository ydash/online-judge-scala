package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P1015Test extends LeetCodeSpec {
  private val table = Table(
    ("k", "expected"),
    (1, 1),
    (2, -1),
    (3, 3),
    (11, 2),
    (3581, 3580)
  )

  test("Test of Smallest Integer Divisible by K") {
    forAll(table) { (k, expected) =>
      P1015.smallestRepunitDivByK(k) shouldBe expected
    }
  }
}
