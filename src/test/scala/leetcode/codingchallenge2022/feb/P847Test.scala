package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P847Test extends LeetCodeSpec {
  private val table = Table(
    ("graph", "expected"),
    (Array(Array[Int]()), 0),
    (Array(Array(1, 2, 3), Array(0), Array(0), Array(0)), 4),
    (Array(Array(1), Array(0, 2, 4), Array(1, 3, 4), Array(2), Array(1, 2)), 4)
  )

  test("Test of Shortest Path Visiting All Nodes") {
    forAll(table) { (graph, expected) =>
      P847.shortestPathLength(graph) shouldBe expected
    }
  }
}
