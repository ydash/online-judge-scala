package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class ReverseWordsInStringSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("the sky is blue", "blue is sky the"),
    ("  hello world  ", "world hello"),
    ("a good   example", "example good a")
  )

  test("Test of Reverse Words in a String") {
    forAll(table) { (s, expected) =>
      ReverseWordsInString.reverseWords(s) shouldBe expected
    }
  }
}
