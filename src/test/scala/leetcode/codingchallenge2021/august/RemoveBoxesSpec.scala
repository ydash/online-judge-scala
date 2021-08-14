package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class RemoveBoxesSpec extends LeetCodeSpec {
  private val table = Table(
    ("boxes", "expected"),
    (Array(1, 3, 2, 2, 2, 3, 4, 3, 1), 23),
    (Array.fill(100)(42), 100 * 100),
    (Array(1), 1),
    ((1 to 100).toArray, 100)
  )
  test("Test of Remove Boxes") {
    forAll(table) { (boxes, expected) =>
      RemoveBoxes.removeBoxes(boxes) shouldBe expected
    }
  }
}
