package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P905Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(3, 1, 2, 4), Array(4, 2, 1, 3)),
    (Array(1, 3), Array(1, 3)),
    (Array(2), Array(2)),
    (Array(1, 2, 3, 4), Array(4, 2, 3, 1))
  )

  test("Test of Sort Array By Parity") {
    forAll(table) { (nums, expected) =>
      P905.sortArrayByParity(nums) shouldBe expected
    }
  }
}
