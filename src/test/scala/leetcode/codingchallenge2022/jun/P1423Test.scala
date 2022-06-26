package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1423Test extends LeetCodeSpec {
  private val table = Table(
    ("cardPoints", "k", "expected"),
    (Array(1, 2, 3, 4, 5, 6, 1), 3, 12),
    (Array(6, 2, 3, 4, 5, 6, 1), 3, 13),
    (Array(1, 2, 100, 4, 10, 10, 10), 3, 103),
    (Array(2, 2, 2), 2, 4),
    (Array(9, 7, 7, 9, 7, 7, 9), 7, 55),
    (Array(42), 1, 42)
  )

  test("Test of Maximum Points You Can Obtain from Cards") {
    forAll(table) { (cardPoints, k, expected) =>
      P1423.maxScore(cardPoints, k) shouldBe expected
    }
  }
}
