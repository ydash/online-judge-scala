package leetcode.codingchallenge2022.mar

import leetcode.LeetCodeSpec

class P1029Test extends LeetCodeSpec {
  private val table = Table(
    ("costs", "expected"),
    (Array(Array(10, 20), Array(30, 200), Array(400, 50), Array(30, 20)), 110),
    (Array(Array(259, 770), Array(448, 54), Array(926, 667), Array(184, 139), Array(840, 118), Array(577, 469)), 1859),
    (
      Array(
        Array(515, 563),
        Array(451, 713),
        Array(537, 709),
        Array(343, 819),
        Array(855, 779),
        Array(457, 60),
        Array(650, 359),
        Array(631, 42)
      ),
      3086
    )
  )

  test("Test of Two City Scheduling") {
    forAll(table) { (costs, expected) =>
      P1029.twoCitySchedCost(costs) shouldBe expected
    }
  }
}
