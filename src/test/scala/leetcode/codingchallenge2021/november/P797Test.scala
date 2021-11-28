package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P797Test extends LeetCodeSpec {
  private val table = Table(
    ("graph", "expected"),
    (
      Array(Array(1, 2), Array(3), Array(3), Array[Int]()),
      Array(Array(0, 1, 3), Array(0, 2, 3))
    ),
    (
      Array(Array(4, 3, 1), Array(3, 2, 4), Array(3), Array(4), Array[Int]()),
      Array(Array(0, 4), Array(0, 3, 4), Array(0, 1, 3, 4), Array(0, 1, 2, 3, 4), Array(0, 1, 4))
    ),
    (Array(Array(1), Array[Int]()), Array(Array(0, 1))),
    (Array(Array(1, 2, 3), Array(2), Array(3), Array[Int]()), Array(Array(0, 1, 2, 3), Array(0, 2, 3), Array(0, 3))),
    (Array(Array(1, 3), Array(2), Array(3), Array[Int]()), Array(Array(0, 1, 2, 3), Array(0, 3)))
  )

  test("Test of All Paths From Source to Target") {
    forAll(table) { (graph, expected) =>
      P797.allPathsSourceTarget(graph) should contain theSameElementsAs expected
    }
  }
}
