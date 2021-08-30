package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class RangeAdditionIISpec extends LeetCodeSpec {
  private val table = Table(
    ("m", "n", "ops", "expected"),
    (3, 3, Array(Array(2, 2), Array(3, 3)), 4),
    (
      3,
      3,
      Array(
        Array(2, 2),
        Array(3, 3),
        Array(3, 3),
        Array(3, 3),
        Array(2, 2),
        Array(3, 3),
        Array(3, 3),
        Array(3, 3),
        Array(2, 2),
        Array(3, 3),
        Array(3, 3),
        Array(3, 3)
      ),
      4
    ),
    (3, 3, Array[Array[Int]](), 9)
  )

  test("Test of Range Addition II") {
    forAll(table) { (m, n, ops, expected) =>
      RangeAdditionII.maxCount(m, n, ops) shouldBe expected
    }
  }
}
