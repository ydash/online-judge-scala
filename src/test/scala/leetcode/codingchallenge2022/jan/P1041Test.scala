package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1041Test extends LeetCodeSpec {
  private val table = Table(
    ("instructions", "expected"),
    ("GRGLGR", true),
    ("RLRRR", true),
    ("GGRRG", true),
    ("LLGLLG", true),
    ("GGRGL", false)
  )

  test("Test of Robot Bounded In Circle") {
    forAll(table) { (instructions, expected) =>
      P1041.isRobotBounded(instructions) shouldBe expected
    }
  }
}
