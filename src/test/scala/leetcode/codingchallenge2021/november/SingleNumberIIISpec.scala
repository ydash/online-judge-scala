package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class SingleNumberIIISpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1, 2, 1, 3, 2, 5), Array(3, 5)),
    (Array(-1, 0), Array(-1, 0)),
    (Array(0, 1), Array(0, 1))
  )

  test("Test of Single Number III") {
    forAll(table) { (nums, expected) =>
      SingleNumberIII.singleNumber(nums) should contain theSameElementsAs expected
    }
  }
}
