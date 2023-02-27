package leetcode.codingchallenge2023

import leetcode.LeetCodeSpec
import leetcode.codingchallenge2023.feb.P427
import leetcode.codingchallenge2023.feb.P427.Node

class P427Test extends LeetCodeSpec {
  private val table = Table(
    ("grid", "expected"),
    (Array(Array(1)), new Node(true, true)),
    (Array(Array(0)), new Node(false, true)),
    (
      Array(Array(0, 1), Array(1, 0)),
      Node(
        value = true,
        isLeaf = false,
        new Node(false, true),
        new Node(true, true),
        new Node(true, true),
        new Node(false, true)
      )
    ),
    (
      Array(
        Array(1, 1, 1, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 1, 1, 1, 1, 1),
        Array(1, 1, 1, 1, 1, 1, 1, 1),
        Array(1, 1, 1, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 1, 0, 0, 0, 0),
        Array(1, 1, 1, 1, 0, 0, 0, 0)
      ),
      Node(
        value = true,
        isLeaf = false,
        new Node(true, true),
        Node(
          value = true,
          isLeaf = false,
          new Node(false, true),
          new Node(false, true),
          new Node(true, true),
          new Node(true, true)
        ),
        new Node(true, true),
        new Node(false, true)
      )
    )
  )
  test("Test of Construct Quad Tree") {
    forAll(table) { (grid, expected) =>
      P427.construct(grid) shouldBe expected
    }
  }
}
