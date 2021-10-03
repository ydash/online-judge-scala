package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class JumpGameSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(2, 3, 1, 1, 4), true),
    (Array(3, 2, 1, 0, 4), false),
    (Array(0), true)
  )

  test("Test of Jum Game") {
    forAll(table) { (nums, expected) =>
      JumpGame.canJump(nums) shouldBe expected
    }
  }
}
