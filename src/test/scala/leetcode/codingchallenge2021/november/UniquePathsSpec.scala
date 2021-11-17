package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class UniquePathsSpec extends LeetCodeSpec {
  private val table = Table(
    ("m", "n", "expected"),
    (3, 7, 28),
    (3, 2, 3),
    (7, 3, 28),
    (3, 3, 6)
  )

  test("Test of Unique Paths") {
    forAll(table) { (m, n, expected) =>
      UniquePaths.uniquePaths(m, n) shouldBe expected
    }
  }
}
