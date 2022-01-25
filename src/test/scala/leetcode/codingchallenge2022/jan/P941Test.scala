package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P941Test extends LeetCodeSpec {
  private val table = Table(
    ("arr", "expected"),
    (Array(1), false),
    (Array(1, 2), false),
    (Array(1, 2, 3), false),
    (Array(3, 2, 1), false),
    (Array(1, 2, 3, 3, 2, 1), false),
    (Array(1, 2, 1), true)
  )

  test("Test of Valid Mountain Array") {
    forAll(table) { (arr, expected) =>
      P941.validMountainArray(arr) shouldBe expected
    }
  }
}
