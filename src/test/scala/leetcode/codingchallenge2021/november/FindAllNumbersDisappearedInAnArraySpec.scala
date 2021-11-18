package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class FindAllNumbersDisappearedInAnArraySpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(4, 3, 2, 7, 8, 2, 3, 1), List(5, 6)),
    (Array(1, 1), List(2))
  )

  test("Test of Find All Numbers Disappeared in an Array") {
    forAll(table) { (nums, expected) =>
      FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums) shouldBe expected
    }
  }
}
