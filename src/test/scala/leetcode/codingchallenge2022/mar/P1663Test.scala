package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1663Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "k", "expected"),
    (1, 1, "a"),
    (1, 26, "z"),
    (10, 26, "aaaaaaaaaq"),
    (3, 78, "zzz"),
    (3, 27, "aay"),
    (5, 73, "aaszz")
  )

  test("Test of Smallest String With A Given Numeric Value") {
    forAll(table) { (n, k, expected) =>
      P1663.getSmallestString(n, k) shouldBe expected
    }
  }
}
