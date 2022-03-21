package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P763Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("a", List(1)),
    ("ab", List(1, 1)),
    ("aa", List(2)),
    ("aba", List(3)),
    ("abacbdcd", List(8)),
    ("ababcbacadefegdehijhklij", List(9, 7, 8)),
    ("eccbbbbdec", List(10))
  )

  test("Test of Partition Labels") {
    forAll(table) { (s, expected) =>
      P763.partitionLabels(s) shouldBe expected
    }
  }
}
