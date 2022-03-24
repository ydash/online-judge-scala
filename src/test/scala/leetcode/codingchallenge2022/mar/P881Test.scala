package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P881Test extends LeetCodeSpec {
  private val table = Table(
    ("people", "limit", "expected"),
    (Array(1), 1, 1),
    (Array(1, 2), 3, 1),
    (Array(3, 2, 2, 1), 3, 3),
    (Array(3, 5, 3, 4), 5, 4),
    (Array(2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10), 50, 11)
  )

  test("Test of Boats to Save People") {
    forAll(table) { (people, limit, expected) =>
      P881.numRescueBoats(people, limit) shouldBe expected
    }
  }
}
