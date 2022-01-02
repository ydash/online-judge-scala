package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1010Test extends LeetCodeSpec {
  private val table = Table(
    ("time", "expected"),
    (Array(60), 0),
    (Array(60, 60, 60), 3),
    (Array(30, 20, 150, 100, 40), 3),
    (Array(472, 66, 114, 8), 2)
  )

  test("Test of Pairs of Songs With Total Durations Divisible by 60") {
    forAll(table) { (time, expected) =>
      P1010.numPairsDivisibleBy60(time) shouldBe expected
    }
  }
}
