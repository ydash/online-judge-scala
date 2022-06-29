package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P406Test extends LeetCodeSpec {
  private val table = Table(
    ("people", "expected"),
    (Array(Array(1, 0)), Array(Array(1, 0))),
    (Array(Array(1, 0), Array(0, 1)), Array(Array(1, 0), Array(0, 1))),
    (Array(Array(1, 0), Array(0, 0)), Array(Array(0, 0), Array(1, 0))),
    (
      Array(Array(7, 0), Array(4, 4), Array(7, 1), Array(5, 0), Array(6, 1), Array(5, 2)),
      Array(Array(5, 0), Array(7, 0), Array(5, 2), Array(6, 1), Array(4, 4), Array(7, 1))
    ),
    (
      Array(Array(6, 0), Array(5, 0), Array(4, 0), Array(3, 2), Array(2, 2), Array(1, 4)),
      Array(Array(4, 0), Array(5, 0), Array(2, 2), Array(3, 2), Array(1, 4), Array(6, 0))
    )
  )

  test("Test of Queue Reconstruction by Height") {
    forAll(table) { (people, expected) =>
      P406.reconstructQueue(people) shouldBe expected
    }
  }
}
