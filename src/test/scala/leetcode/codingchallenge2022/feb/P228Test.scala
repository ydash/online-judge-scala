package leetcode.codingchallenge2022.feb

import leetcode.LeetCodeSpec

class P228Test extends LeetCodeSpec{
  private val table = Table(
    ("nums", "expected"),
    (Array[Int](), List[String]()),
    (Array(1), List("1")),
    (Array(0,1), List("0->1")),
    (Array(0,2), List("0", "2")),
    (Array(0,1,2,4,5,7), List("0->2","4->5","7")),
    (Array(0,2,3,4,6,8,9), List("0","2->4","6","8->9"))
  )

  test("Test of Summary Ranges") {
    forAll(table) { (nums, expected) =>
      P228.summaryRanges(nums) shouldBe expected
    }
  }
}
