package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1337Test extends LeetCodeSpec {
  private val table = Table(
    ("mat", "k", "expected"),
    (
      Array(
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 0),
        Array(1, 0, 0, 0, 0),
        Array(1, 1, 0, 0, 0),
        Array(1, 1, 1, 1, 1)
      ),
      3,
      Array(2, 0, 3)
    ),
    (Array(Array(1, 0, 0, 0), Array(1, 1, 1, 1), Array(1, 0, 0, 0), Array(1, 0, 0, 0)), 2, Array(0, 2))
  )

  test("Test of The K Weakest Rows in a Matrix") {
    forAll(table) { (mat, k, expected) =>
      P1337.kWeakestRows(mat, k) shouldBe expected
    }
  }
}
