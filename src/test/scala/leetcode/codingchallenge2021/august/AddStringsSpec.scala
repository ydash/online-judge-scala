package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class AddStringsSpec extends LeetCodeSpec {
  private val table = Table(
    ("num1", "num2", "expected"),
    ("11", "123", "134"),
    ("123", "7", "130"),
    ("1", "999", "1000"),
    ("456", "77", "533"),
    ("0", "0", "0")
  )
  test("Test of Add Strings") {
    forAll(table) { (num1, num2, expected) =>
      AddStrings.addStrings(num1, num2) shouldBe expected
    }
  }
}
