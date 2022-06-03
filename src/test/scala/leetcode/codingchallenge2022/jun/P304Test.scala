package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P304Test extends LeetCodeSpec {
  test("Test of Range Sum Query 2D - Immutable") {
    val numMatrix = new P304.NumMatrix(
      Array(
        Array(3, 0, 1, 4, 2),
        Array(5, 6, 3, 2, 1),
        Array(1, 2, 0, 1, 5),
        Array(4, 1, 0, 1, 7),
        Array(1, 0, 3, 0, 5)
      )
    )
    numMatrix.sumRegion(2, 1, 4, 3) shouldBe 8
    numMatrix.sumRegion(1, 1, 2, 2) shouldBe 11
    numMatrix.sumRegion(1, 2, 2, 4) shouldBe 12
    numMatrix.sumRegion(0, 0, 0, 0) shouldBe 3
    numMatrix.sumRegion(0, 1, 0, 3) shouldBe 5
    numMatrix.sumRegion(2, 0, 2, 0) shouldBe 1
    numMatrix.sumRegion(0, 0, 0, 1) shouldBe 3
    numMatrix.sumRegion(0, 1, 0, 1) shouldBe 0
  }
}
