package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class FindAllDuplicatesInAnArraySpec extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(4, 3, 2, 7, 8, 2, 3, 1), List(2, 3)),
    (Array(1, 1, 2), List(1)),
    (Array(1), List())
  )

  test("Test of Find All Duplicates in Array") {
    forAll(table) { (nums, expected) =>
      FindAllDuplicatesInAnArray.findDuplicates(nums) shouldBe expected
    }
  }
}
