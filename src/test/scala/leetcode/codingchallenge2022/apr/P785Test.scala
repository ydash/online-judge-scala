package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P785Test extends LeetCodeSpec {
  private val table = Table(
    ("graph", "expected"),
    (Array(Array(1, 2, 3), Array(0, 2), Array(0, 1, 3), Array(0, 2)), false),
    (Array(Array(1, 3), Array(0, 2), Array(1, 3), Array(0, 2)), true),
    (Array(Array(1), Array(0, 3), Array(3), Array(1, 2)), true),
    (Array(Array(3), Array(2, 4), Array(1), Array(0, 4), Array(1, 3)), true),
    (Array(Array.empty[Int], Array(2), Array(1)), true),
    (Array(Array(4), Array.empty[Int], Array(4), Array(4), Array(0, 2, 3)), true)
  )

  test("Test of Is Graph Bipartite?") {
    forAll(table) { (graph, expected) =>
      P785.isBipartite(graph) shouldBe expected
    }
  }
}
