package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P946Test extends LeetCodeSpec {
  private val table = Table(
    ("pushed", "popped", "expected"),
    (Array(1, 2, 3, 4, 5), Array(4, 5, 3, 2, 1), true),
    (Array(1, 2, 3, 4, 5), Array(4, 3, 5, 1, 2), false),
    (Array(10, 2, 43, 14, 5), Array(14, 5, 43, 2, 10), true),
    (Array(10, 2, 43, 14, 5), Array(14, 43, 5, 10, 2), false),
    (Array(0), Array(0), true),
    (Array(0, 1), Array(0, 1), true),
    (Array(0, 1), Array(1, 0), true)
  )

  test("Test of Validate Stack Sequences") {
    forAll(table) { (pushed, popped, expected) =>
      P946.validateStackSequences(pushed, popped) shouldBe expected
    }
  }
}
