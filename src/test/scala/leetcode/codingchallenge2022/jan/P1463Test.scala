package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1463Test extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(1, 2), Array(3, 4)), 10),
    (Array(Array(0, 0), Array(0, 0)), 0),
    (Array(Array(3, 1, 1), Array(2, 5, 1), Array(1, 5, 5), Array(2, 1, 1)), 24),
    (
      Array(
        Array(1, 0, 0, 0, 0, 0, 1),
        Array(2, 0, 0, 0, 0, 3, 0),
        Array(2, 0, 9, 0, 0, 0, 0),
        Array(0, 3, 0, 5, 4, 0, 0),
        Array(1, 0, 2, 3, 0, 0, 6)
      ),
      28
    )
  )

  test("Test of Cherry Pickup II") {
    forAll(table) { (grid, expected) =>
      P1463.cherryPickup(grid) shouldBe expected
    }
  }
}
