package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P347Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "k", "expected"),
    (Array(1, 1, 1, 2, 2, 3), 2, Array(1, 2)),
    (Array(1), 1, Array(1)),
    (Array(2, 5, 3, 3), 1, Array(3)),
    (Array(1, 1, 1, 2, 2, 3, 3), 3, Array(1, 2, 3))
  )

  test("Test of Top K Frequent Elements") {
    forAll(table) { (nums, k, expected) =>
      P347.topKFrequent(nums, k) shouldBe expected
    }
  }
}
