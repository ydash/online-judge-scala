package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class DailyTemperaturesSpec extends LeetCodeSpec {
  private val table = Table(
    ("temperatures", "expected"),
    (Array(73, 74, 75, 71, 69, 72, 76, 73), Array(1, 1, 4, 2, 1, 1, 0, 0)),
    (Array(30, 40, 50, 60), Array(1, 1, 1, 0)),
    (Array(30, 60, 90), Array(1, 1, 0))
  )

  test("Test of Daily Temperatures") {
    forAll(table) { (temperatures, expected) =>
      DailyTemperatures.dailyTemperatures(temperatures) shouldBe expected
    }
  }
}
