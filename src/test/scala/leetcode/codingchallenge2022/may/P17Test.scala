package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P17Test extends LeetCodeSpec {
  private val table = Table(
    ("digits", "expected"),
    ("23", List("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
    ("", List()),
    ("2", List("a", "b", "c"))
  )

  test("Test of Letter Combinations of a Phone Number") {
    forAll(table) { (digits, expected) =>
      P17.letterCombinations(digits) should contain theSameElementsAs expected
    }
  }
}
