package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ExpressionAddOperatorsSpec extends LeetCodeSpec {
  private val table = Table(
    ("num", "target", "expected"),
    ("123", 6, List("1*2*3", "1+2+3")),
    ("232", 8, List("2*3+2", "2+3*2")),
    ("105", 5, List("1*0+5", "10-5")),
    ("00", 0, List("0*0", "0+0", "0-0")),
    ("3456237490", 9191, List()),
    ("2386092949", 2147483646, List("238609294*9")),
    ("9999999999", 410065399, List()),
    ("2147483648", -2147483648, List())
  )

  test("Test of Expression Add Operators") {
    forAll(table) { (num, target, expected) =>
      ExpressionAddOperators.addOperators(num, target) should contain theSameElementsAs expected
    }
  }

}
