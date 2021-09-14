package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ReverseOnlyLettersSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("ab-cd", "dc-ba"),
    ("a-bC-dEf-ghIj", "j-Ih-gfE-dCba"),
    ("Test1ng-Leet=code-Q!", "Qedo1ct-eeLg=ntse-T!"),
    ("!worning", "!gninrow")
  )

  test("Test of Reverse Only Letters") {
    forAll(table) { (s, expected) =>
      ReverseOnlyLetters.reverseOnlyLetters(s) shouldBe expected
    }
  }

  test("test") {
    println('a'.toInt)
    println('z'.toInt)
    println('A'.toInt)
    println('Z'.toInt)
    println(('Z' + 1).toChar)
  }
}
