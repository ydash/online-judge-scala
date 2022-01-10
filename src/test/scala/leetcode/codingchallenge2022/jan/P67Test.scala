package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P67Test extends LeetCodeSpec {
  private val table = Table(
    ("a", "b", "expected"),
    ("0", "0", "0"),
    ("1", "0", "1"),
    ("1", "1", "10"),
    ("11", "1", "100"),
    ("1010", "1011", "10101")
  )

  test("Test of Add Binary") {
    forAll(table) { (a, b, expected) =>
      P67.addBinary(a, b) shouldBe expected
    }
  }
}
