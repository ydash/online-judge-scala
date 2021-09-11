package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class BasicCalculatorSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("2 - 1 + 2 ", 3),
    ("(1+(4+5+2)-3)+(6+8)", 23),
    ("12345", 12345),
    ("-(".repeat(1e5.toInt) + "42" + ")".repeat(1e5.toInt), 42),
    ("- (3 + (4 + 5))", -12)
  )

  test("Test of Basic Calculator") {
    forAll(table) { (s, expected) =>
      BasicCalculator.calculate(s) shouldBe expected
    }
  }
}
