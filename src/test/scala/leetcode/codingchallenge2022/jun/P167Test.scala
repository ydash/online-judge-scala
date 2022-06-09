package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P167Test extends LeetCodeSpec {
  private val table = Table(
    ("numbers", "target", "expected"),
    (Array(2, 7, 11, 15), 9, Array(1, 2)),
    (Array(-1, 0), -1, Array(1, 2))
  )

  test("Test of Two Sum II - Input Array Is Sorted") {
    forAll(table) { (numbers, target, expected) =>
      P167.twoSum(numbers, target) shouldBe expected
    }
  }
}
