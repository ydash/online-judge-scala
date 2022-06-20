package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P820Test extends LeetCodeSpec {
  private val table = Table(
    ("words", "expected"),
    (Array("time", "me", "bell"), 10),
    (Array("a"), 2),
    (Array("a", "a", "a", "a", "a"), 2)
  )

  test("Test of Short Encoding of Words") {
    forAll(table) { (words, expected) =>
      P820.minimumLengthEncoding(words) shouldBe expected
    }
  }
}
