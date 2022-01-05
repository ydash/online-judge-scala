package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P131Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("a", List(List("a"))),
    ("ab", List(List("a", "b"))),
    ("aa", List(List("a", "a"), List("aa"))),
    ("aab", List(List("a", "a", "b"), List("aa", "b"))),
    ("abc", List(List("a", "b", "c")))
  )

  test("Test of Palindrome Partitioning") {
    forAll(table) { (s, expected) =>
      P131.partition(s) should contain theSameElementsAs expected
    }
  }
}
