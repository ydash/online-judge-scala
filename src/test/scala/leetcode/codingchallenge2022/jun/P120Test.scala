package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P120Test extends LeetCodeSpec {
  private val table = Table(
    ("triangle", "expected"),
    (List(List(2), List(3, 4), List(6, 5, 7), List(4, 1, 8, 3)), 11),
    (List(List(-10)), -10),
    (List(List(1), List(7, 2)), 3)
  )

  test("Test of Triangle") {
    forAll(table) { (triangle, expected) =>
      P120.minimumTotal(triangle) shouldBe expected
    }
  }
}
