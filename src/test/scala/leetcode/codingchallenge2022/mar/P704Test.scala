package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P704Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "target", "expected"),
    (Array(-1, 0, 3, 5, 9, 12), 9, 4),
    (Array(-1, 0, 3, 5, 9, 12), 2, -1),
    (Array(-1, 0, 3, 5, 9, 12), -1, 0),
    (Array(-1, 0, 3, 5, 9, 12), -4, -1),
    (Array(-1, 0, 3, 5, 9, 12), 12, 5),
    (Array(-1, 0, 3, 5, 9, 12), 42, -1)
  )

  test("Test of Binary Search") {
    forAll(table) { (nums, target, expected) =>
      P704.search(nums, target) shouldBe expected
    }
  }
}
