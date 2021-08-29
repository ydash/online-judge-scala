package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class PatchingArraySpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "n", "expected"),
    (Array(1, 3), 6, 1),
    (Array(1, 5, 10), 20, 2),
    (Array(1, 2, 2), 5, 0),
    (Array(1), Int.MaxValue, 30)
  )

  test("Test of Patching Array") {
    forAll(table) { (nums, n, expected) =>
      PatchingArray.minPatches(nums, n) shouldBe expected
    }
  }
}
