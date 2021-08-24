package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class ComplexNumberMultiplicationSpec extends LeetCodeSpec {
  private val table = Table(
    ("num1", "num2", "expected"),
    ("1+1i", "1+1i", "0+2i"),
    ("1+-1i", "1+-1i", "0+-2i"),
    ("0+6i", "7+0i", "0+42i"),
    ("0+6i", "0+-7i", "42+0i"),
    ("6+3i", "6+4i", "24+42i")
  )
  test("Test of Complex Number Multiplication") {
    forAll(table) { (num1, num2, expected) =>
      ComplexNumberMultiplication.complexNumberMultiply(num1, num2) shouldBe expected
    }
  }
}
