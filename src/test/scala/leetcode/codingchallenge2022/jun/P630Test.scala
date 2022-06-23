package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P630Test extends LeetCodeSpec {
  private val table = Table(
    ("courses", "expected"),
    (Array(Array(100, 200), Array(200, 1300), Array(1000, 1250), Array(2000, 3200)), 3),
    (Array(Array(1, 2)), 1),
    (Array(Array(3, 2), Array(4, 3)), 0),
    (Array(Array(5, 5), Array(4, 6), Array(2, 6)), 2)
  )

  test("Test of Course Schedule III") {
    forAll(table) { (courses, expected) =>
      P630.scheduleCourse(courses) shouldBe expected
    }
  }
}
