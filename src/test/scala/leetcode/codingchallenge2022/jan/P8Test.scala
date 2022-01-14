package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P8Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("42", 42),
    ("    -42", -42),
    ("  -d42", 0),
    ("18e42", 18),
    ("-91283472332", Int.MinValue),
    ("1367398239827389982", Int.MaxValue),
    ("", 0),
    (" ", 0),
    (Int.MaxValue.toString, Int.MaxValue),
    (Int.MinValue.toString, Int.MinValue)
  )

  test("Test of String to Integer") {
    forAll(table) { (s, expected) =>
      P8.myAtoi(s) shouldBe expected
    }
  }
}
