package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P134Test extends LeetCodeSpec {
  private val table = Table(
    ("gas", "cost", "expected"),
    (Array(2), Array(1), 0),
    (Array(2), Array(3), -1),
    (Array(1, 2, 3, 4, 5), Array(3, 4, 5, 1, 2), 3),
    (Array(2, 3, 4), Array(3, 4, 3), -1)
  )

  test("Test of Gas Station") {
    forAll(table) { (gas, cost, expected) =>
      P134.canCompleteCircuit(gas, cost) shouldBe expected
    }
  }
}
