package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P81Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "target", "expected"),
    (Array(2, 5, 6, 0, 0, 1, 2), 0, true),
    (Array(2, 5, 6, 0, 0, 1, 2), 3, false),
    (Array(2, 5, 6, 0, 0, 1, 2), 5, true),
    (Array(2, 5, 6, 0, 0, 1, 2), 1, true),
    (Array(2, 5, 6, 0, 0, 1, 2), 7, false),
    (Array(2, 5, 6, 0, 0, 1, 2), -1, false),
    (Array(0), 0, true),
    (Array(0), -1, false),
    (Array(0), 1, false),
    (Array(0, 1), 0, true),
    (Array(0, 1), 1, true),
    (Array(0, 1), -1, false),
    (Array(0, 1), 2, false),
    (Array(0, 1, 2, 0), 2, true)
  )

  test("Test of Search in Rotated Sorted Array II") {
    forAll(table) { (nums, target, expected) =>
      P81.search(nums, target) shouldBe expected
    }
  }
}
