package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P878Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "a", "b", "expected"),
    (1, 2, 3, 2),
    (4, 2, 3, 6),
    (5, 2, 4, 10),
    (3, 6, 4, 8),
    (6, 5, 6, 18)
  )

  test("Test of Nth Magical Number") {
    forAll(table) { (n, a, b, expected) =>
      P878.nthMagicalNumber(n, a, b) shouldBe expected
    }
  }
}
