package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1094Test extends LeetCodeSpec {
  private val table = Table(
    ("trips", "capacity", "expected"),
    (Array(Array(2, 1, 5), Array(3, 3, 7)), 4, false),
    (Array(Array(2, 1, 5), Array(3, 3, 7)), 5, true)
  )

  test("Test of Car Pooling") {
    forAll(table) { (trips, capacity, expected) =>
      P1094.carPooling(trips, capacity) shouldBe expected
    }
  }
}
