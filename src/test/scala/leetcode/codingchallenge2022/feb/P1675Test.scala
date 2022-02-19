package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P1675Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 3, 4), 1),
    (Array(4, 1, 5, 20, 3), 3),
    (Array(2, 10, 8), 3),
    (Array(3, 5), 1)
  )

  test("Test of Minimize Deviation in Array") {
    forAll(table) { (nums, expected) =>
      P1675.minimumDeviation(nums) shouldBe expected
    }
  }
}
