package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P790Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    (3, 5),
    (5, 24),
    (1000, 979232805)
  )

  test("Test of Domino and Tromino Tiling") {
    forAll(table) { (n, expected) =>
      P790.numTilings(n) shouldBe expected
    }
  }
}
