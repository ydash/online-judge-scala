package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class ReachableNodesInSubdividedGraphSpec extends LeetCodeSpec {
  private val table = Table(
    ("edges", "maxMoves", "n", "expected"),
    (Array(Array(0, 1, 10), Array(0, 2, 1), Array(1, 2, 2)), 6, 3, 13),
    (Array(Array(0, 1, 4), Array(1, 2, 6), Array(0, 2, 8), Array(1, 3, 1)), 10, 4, 23),
    (Array(Array(1, 2, 4), Array(1, 4, 5), Array(1, 3, 1), Array(2, 3, 4), Array(3, 4, 5)), 17, 5, 1),
    (Array(Array(0, 1, 1), Array(1, 2, 1), Array(1, 3, 1)), 4, 4, 7),
    (Array(Array(0, 1, 3), Array(0, 2, 5), Array(1, 2, 10)), 10, 3, 21),
    (Array(Array(0, 1, 3), Array(0, 2, 5), Array(1, 2, 10)), 13, 3, 21),
    (Array(Array(0, 1, 3), Array(0, 2, 5), Array(1, 2, 10)), 100, 3, 21),
    (Array(Array(0, 1, 3), Array(0, 2, 5), Array(1, 2, 10)), 7, 3, 15),
    (Array(Array(0, 1, 1), Array(0, 2, 4), Array(1, 2, 3)), 6, 3, 11),
    (Array(Array(0, 1, 8), Array(0, 2, 8), Array(1, 2, 5), Array(0, 3, 1), Array(2, 3, 1)), 10, 4, 27)
  )

  test("Test of Reachable Nodes in Subdivided Graph") {
    forAll(table) { (edges, maxMoves, n, expected) =>
      ReachableNodesInSubdividedGraph.reachableNodes(edges, maxMoves, n) shouldBe expected
    }
  }
}
