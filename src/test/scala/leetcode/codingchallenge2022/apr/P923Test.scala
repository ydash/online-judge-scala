package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P923Test extends LeetCodeSpec {
  private val table = Table(
    ("arr", "target", "expected"),
    (Array(1, 1, 2, 2, 3, 3, 4, 4, 5, 5), 8, 20),
    (Array(1, 1, 2, 2, 2, 2), 5, 12),
    (Array(1, 2, 3), 300, 0),
    (Array.fill(3000)(0), 0, 495500972)
  )

  test("Test of 3Sum With Multiplicity") {
    forAll(table) { (arr, target, expected) =>
      P923.threeSumMulti(arr, target) shouldBe expected
    }
  }
}
