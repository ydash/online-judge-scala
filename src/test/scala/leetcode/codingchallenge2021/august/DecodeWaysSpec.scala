package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class DecodeWaysSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("1", 1),
    ("12", 2),
    ("226", 3),
    ("1010", 1),
    ("11106", 2),
    ("1111111111",89),
    ("0", 0),
    ("06", 0),
    ("505", 0),
    ("550", 0)
  )

  test("Test of Decode Ways") {
    forAll(table) { (s, expected) =>
      DecodeWays.numDecodings(s) shouldBe expected
    }
  }
}
