package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P986Test extends LeetCodeSpec {
  private val table = Table(
    ("f", "s", "expected"),
    (
      Array(Array(0, 2), Array(5, 10), Array(13, 23), Array(24, 25)),
      Array(Array(1, 5), Array(8, 12), Array(15, 24), Array(25, 26)),
      Array(Array(1, 2), Array(5, 5), Array(8, 10), Array(15, 23), Array(24, 24), Array(25, 25))
    ),
    (Array(Array(1, 3), Array(5, 9)), Array[Array[Int]](), Array[Array[Int]]()),
    (Array[Array[Int]](), Array(Array(4, 8), Array(10, 12)), Array[Array[Int]]()),
    (Array(Array(1, 7)), Array(Array(3, 10)), Array(Array(3, 7)))
  )

  test("Test of Interval List Intersection") {
    forAll(table) { (f, s, expected) =>
      P986.intervalIntersection(f, s) shouldBe expected
    }
  }
}
