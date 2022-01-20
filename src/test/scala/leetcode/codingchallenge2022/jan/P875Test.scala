package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P875Test extends LeetCodeSpec {
  private val table = Table(
    ("piles", "h", "expected"),
    (Array(42), 1, 42),
    (Array(3, 6, 7, 11), 8, 4),
    (Array(30, 11, 23, 4, 20), 5, 30),
    (Array(30, 11, 23, 4, 20), 6, 23)
  )

  test("Test of Koko Eating Bananas") {
    forAll(table) { (piles, h, expected) =>
      P875.minEatingSpeed(piles, h) shouldBe expected
    }
  }
}
