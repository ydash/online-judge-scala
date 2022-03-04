package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P799Test extends LeetCodeSpec {
  private val table = Table(
    ("poured", "query_row", "query_glass", "expected"),
    (1, 1, 1, 0),
    (2, 1, 1, 0.5),
    (100000009, 33, 17, 1),
    (4, 2, 2, 0.25),
    (4, 2, 1, 0.5),
    (6, 3, 1, 0.25),
    (6, 2, 0, 0.75),
    (1000000000, 99, 99, 0)
  )

  test("Test of Champagne Tower") {
    forAll(table) { (poured, query_row, query_glass, expected) =>
      P799.champagneTower(poured, query_row, query_glass) shouldBe expected
    }
  }
}
