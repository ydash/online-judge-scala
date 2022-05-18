package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P1192Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "connections", "expected"),
    (4, List(List(0, 1), List(1, 2), List(2, 0), List(1, 3)), List(List(1, 3))),
    (2, List(List(0, 1)), List(List(0, 1)))
  )

  test("Test of Critical Connections in a Network") {
    forAll(table) { (n, connections, expected) =>
      P1192.criticalConnections(n, connections) shouldBe expected
    }
  }
}
