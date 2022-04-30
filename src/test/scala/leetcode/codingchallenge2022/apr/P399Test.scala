package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P399Test extends LeetCodeSpec {
  private val table = Table(
    ("equations", "values", "queries", "expected"),
    (
      List(List("a", "b"), List("b", "c")),
      Array(2.0, 3.0),
      List(List("a", "c"), List("b", "a"), List("a", "e"), List("a", "a"), List("x", "x")),
      Array(6, 0.5, -1, 1, -1)
    ),
    (
      List(List("a", "b"), List("b", "c"), List("bc", "cd")),
      Array(1.5, 2.5, 5.0),
      List(List("a", "c"), List("c", "b"), List("bc", "cd"), List("cd", "bc")),
      Array(3.75, 0.4, 5, 0.2)
    ),
    (
      List(List("a", "b")),
      Array(0.5),
      List(List("a", "b"), List("b", "a"), List("a", "c"), List("x", "y")),
      Array(0.5, 2, -1, -1)
    )
  )

  test("Test of Evaluate Division") {
    forAll(table) { (equations, values, queries, expected) =>
      P399.calcEquation(equations, values, queries) shouldBe expected
    }
  }
}
