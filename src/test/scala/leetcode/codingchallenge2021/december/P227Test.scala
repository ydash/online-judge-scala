package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P227Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("3+2*2", 7),
    ("3/2", 1),
    ("3+5 / 2 ", 5)
  )

  test("Test of Basic Calculator II") {
    forAll(table) { (s, expected) =>
      P227.calculate(s) shouldBe expected
    }
  }
}
