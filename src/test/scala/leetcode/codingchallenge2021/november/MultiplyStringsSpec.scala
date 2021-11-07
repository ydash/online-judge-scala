package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class MultiplyStringsSpec extends LeetCodeSpec {
  private val table = Table(
    ("num1", "num2", "expected"),
    ("2", "3", "6"),
    ("6", "7", "42"),
    ("42", "11", "462"),
    ("123", "456", "56088"),
    ("123", "0", "0"),
    ("123", "1", "123")
  )

  test("Test of Multiply Strings") {
    forAll(table) { (num1, num2, expected) =>
      MultiplyStrings.multiply(num1, num2) shouldBe expected
    }
  }
}
