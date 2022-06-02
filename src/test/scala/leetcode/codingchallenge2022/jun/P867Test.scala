package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P867Test extends LeetCodeSpec {
  private val table = Table(
    ("matrix", "expected"),
    (Array(Array(1)), Array(Array(1))),
    (Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9)), Array(Array(1, 4, 7), Array(2, 5, 8), Array(3, 6, 9))),
    (Array(Array(1, 2, 3), Array(4, 5, 6)), Array(Array(1, 4), Array(2, 5), Array(3, 6)))
  )

  test("Test of Transpose Matrix") {
    forAll(table) { (matrix, expected) =>
      P867.transpose(matrix) shouldBe expected
    }
  }
}
