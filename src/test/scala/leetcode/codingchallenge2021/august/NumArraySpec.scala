package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class NumArraySpec extends LeetCodeSpec {
  test("Test of Range Sum Query - Immutable 1") {
    val numArray = new NumArray(Array(-2, 0, 3, -5, 2, -1))
    val table = Table(
      ("start", "end", "expected"),
      (0, 0, -2),
      (2, 3, -2),
      (0, 2, 1),
      (2, 5, -1),
      (0, 5, -3)
    )
    forAll(table) { (start, end, expected) =>
      numArray.sumRange(start, end) shouldBe expected
    }
  }

  test("Test of Range Sum Query - Immutable 2") {
    val numArray = new NumArray(Array(1, 5, -8, 7, 6))
    val table = Table(
      ("start", "end", "expected"),
      (2, 2, -8),
      (2, 3, -1),
      (0, 2, -2),
      (2, 4, 5),
      (0, 4, 11)
    )
    forAll(table) { (start, end, expected) =>
      numArray.sumRange(start, end) shouldBe expected
    }
  }

}
