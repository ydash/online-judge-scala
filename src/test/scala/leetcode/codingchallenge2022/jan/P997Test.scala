package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P997Test extends LeetCodeSpec {
  private val table = Table(
    ("n", "trust", "expected"),
    (1, Array[Array[Int]](), 1),
    (2, Array(Array(1, 2)), 2),
    (2, Array(Array(1, 2), Array(2, 1)), -1),
    (3, Array(Array(1, 3), Array(2, 3)), 3),
    (3, Array(Array(1, 3), Array(2, 3), Array(3, 1)), -1),
    (4, Array(Array(1, 3), Array(1, 4), Array(2, 3), Array(2, 4), Array(4, 3)), 3)
  )

  test("Test of Find the Town Judge") {
    forAll(table) { (n, trust, expected) =>
      P997.findJudge(n, trust) shouldBe expected
    }
  }
}
