package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class ThreeSumSpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(-1, 0, 1, 2, -1, -4), List(List(-1, -1, 2), List(-1, 0, 1))),
    (Array(-1, 0, 1), List(List(-1, 0, 1))),
    (Array[Int](), List[List[Int]]()),
    (Array(0), List[List[Int]]())
  )

  test("Test of Three Sum") {
    forAll(table) { (nums, expected) =>
      ThreeSum.threeSum(nums) shouldBe expected
    }
  }
}
