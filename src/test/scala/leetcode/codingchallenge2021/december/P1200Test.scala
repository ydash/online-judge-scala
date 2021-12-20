package leetcode.codingchallenge2021.december

import leetcode.LeetCodeSpec

class P1200Test extends LeetCodeSpec {
  private val table = Table(
    ("arr", "expected"),
    (Array(4, 2, 1, 3), List(List(1, 2), List(2, 3), List(3, 4))),
    (Array(1, 3, 6, 10, 15), List(List(1, 3))),
    (Array(1,2), List(List(1,2))),
    (Array(3, 8, -10, 23, 19, -4, -14, 27), List(List(-14, -10), List(19, 23), List(23, 27)))
  )

  test("Test of Minimum Absolute Difference") {
    forAll(table) { (arr, expected) =>
      P1200.minimumAbsDifference(arr) shouldBe expected
    }
  }
}
