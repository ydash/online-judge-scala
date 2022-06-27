package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1689Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "expected"),
    ("32", 3),
    ("82734", 8),
    ("27346209830709182346", 9),
    ("5", 5)
  )

  test("Test of Partitioning Into Minimum Number Of Deci-Binary Numbers") {
    forAll(table) { (n, expected) =>
      P1689.minPartitions(n) shouldBe expected
    }
  }
}
