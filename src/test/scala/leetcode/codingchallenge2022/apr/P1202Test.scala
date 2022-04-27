package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1202Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "pairs", "expected"),
    ("a", List(), "a"),
    ("ab", List(List(0, 1)), "ab"),
    ("ba", List(List(0, 1)), "ab"),
    ("dcab", List(List(0, 3), List(1, 2)), "bacd"),
    ("dcab", List(List(0, 3), List(1, 2), List(0, 2)), "abcd"),
    ("cba", List(List(0, 1), List(1, 2)), "abc")
  )

  test("Test of Smallest String With Swaps") {
    forAll(table) { (s, pairs, expected) =>
      P1202.smallestStringWithSwaps(s, pairs) shouldBe expected
    }
  }
}
