package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P287Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 3, 4, 2, 2), 2),
    (Array(3, 1, 3, 4, 2), 3),
    (Array(2, 2, 2, 2, 2), 2)
  )

  test("Test of Find the Duplicate Number") {
    forAll(table) { (nums, expected) =>
      P287.findDuplicate(nums) shouldBe expected
    }
  }
}
