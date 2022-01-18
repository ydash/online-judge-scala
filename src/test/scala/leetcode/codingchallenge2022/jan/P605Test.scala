package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P605Test extends LeetCodeSpec {
  private val table = Table(
    ("flowerbed", "n", "expected"),
    (Array(1), 1, false),
    (Array(0), 1, true),
    (Array(1, 0, 0, 0, 1), 1, true),
    (Array(1, 0, 0, 0, 1), 2, false),
    (Array(1, 0, 0, 0, 1), 0, true)
  )

  test("Test of Can Place Flowers") {
    forAll(table) { (flowerbed, n, expected) =>
      P605.canPlaceFlowers(flowerbed, n) shouldBe expected
    }
  }
}
