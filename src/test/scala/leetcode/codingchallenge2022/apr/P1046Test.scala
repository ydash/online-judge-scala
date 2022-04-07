package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P1046Test extends LeetCodeSpec {
  private val table = Table(
    ("stones", "expected"),
    (Array(2, 7, 4, 1, 8, 1), 1),
    (Array(42), 42),
    (Array(9, 9), 0)
  )

  test("Test of Last Stone Wight") {
    forAll(table) { (stones, expected) =>
      P1046.lastStoneWeight(stones) shouldBe expected
    }
  }
}
