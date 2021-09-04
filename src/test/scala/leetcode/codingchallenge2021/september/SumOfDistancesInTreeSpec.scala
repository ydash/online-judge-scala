package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class SumOfDistancesInTreeSpec extends LeetCodeSpec {
  private val table = Table(
    ("n", "edges", "expected"),
    (6, Array(Array(0, 1), Array(0, 2), Array(2, 3), Array(2, 4), Array(2, 5)), Array(8, 12, 6, 10, 10, 10)),
    (1, Array.empty[Array[Int]], Array(0)),
    (2, Array(Array(1, 0)), Array(1, 1))
  )

  test("Test of Sum of Distances in Tree") {
    forAll(table) { (n, edges, expected) =>
      SumOfDistancesInTree.sumOfDistancesInTree(n, edges) shouldBe expected
    }
  }
}
