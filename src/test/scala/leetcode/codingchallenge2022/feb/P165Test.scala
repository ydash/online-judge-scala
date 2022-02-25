package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P165Test extends LeetCodeSpec {
  private val table = Table(
    ("version1", "version2", "expected"),
    ("1.01", "1.001", 0),
    ("1.0", "1.0.0", 0),
    ("1.0.0", "1.0", 0),
    ("0.1", "1.1", -1),
    ("1.1", "0.1", 1),
    ("1", "2", -1),
    ("1.0.1", "1.0", 1),
    ("1.0", "1.0.1", -1)
  )

  test("Test of Compare Version Numbers") {
    forAll(table) { (v1, v2, expected) =>
      P165.compareVersion(v1, v2) shouldBe expected
    }
  }
}
