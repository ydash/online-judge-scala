package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P421Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(1), 0),
    (Array(42, 42), 0),
    (Array(0, 42), 42),
    (Array(8, 0), 8),
    (Array(4, 6, 7), 3),
    (Array(3, 10, 5, 25, 8), 28),
    (Array(14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70), 127)
  )

  test("Test of Maximum XOR of Two Numbers in an Array") {
    forAll(table) { (nums, expected) =>
      P421.findMaximumXOR(nums) shouldBe expected
    }
  }
}
