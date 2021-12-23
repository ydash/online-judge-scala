package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P210Test extends LeetCodeSpec {
  private val table = Table(
    ("numCourses", "prerequisites", "expected"),
    (1, Array[Array[Int]](), Array(0)),
    (2, Array(Array(1, 0)), Array(0, 1)),
    (4, Array(Array(1, 0), Array(2, 0), Array(3, 1), Array(3, 2)), Array(0, 2, 1, 3)),
    (4, Array(Array(1, 0), Array(2, 0), Array(3, 0), Array(2, 1)), Array(0, 3, 1, 2))
  )

  test("Test of Course Schedule II") {
    forAll(table) { (numCourses, prerequisites, expected) =>
      P210.findOrder(numCourses, prerequisites) shouldBe expected
    }
  }
}
