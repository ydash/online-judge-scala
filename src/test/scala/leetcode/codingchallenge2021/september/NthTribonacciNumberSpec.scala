package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class NthTribonacciNumberSpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (0, 0),
    (1, 1),
    (2, 1),
    (4, 4),
    (25, 1389537)
  )

  test("Test of N-th Tribonacci Number") {
    forAll(table) { (n, expected) =>
      NthTribonacciNumber.tribonacci(n) shouldBe expected
    }
  }
}
