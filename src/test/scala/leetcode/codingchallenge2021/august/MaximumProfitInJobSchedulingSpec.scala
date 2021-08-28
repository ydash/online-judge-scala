package leetcode.codingchallenge2021.august

import leetcode.LeetCodeSpec

class MaximumProfitInJobSchedulingSpec extends LeetCodeSpec {
  private val table = Table(
    ("startTime", "endTime", "profit", "expected"),
    (Array(1, 2, 3, 3), Array(3, 4, 5, 6), Array(50, 10, 40, 70), 120),
    (Array(1, 2, 3, 4, 6), Array(3, 5, 10, 6, 9), Array(20, 20, 100, 70, 60), 150),
    (Array(1, 1, 1), Array(2, 3, 4), Array(5, 6, 4), 6),
    (Array(1), Array(2), Array(42), 42)
  )

  test("Test of Maximum Profit in Job Scheduling") {
    forAll(table) { (startTime, endTime, profit, expected) =>
      MaximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit) shouldBe expected
    }
  }
}
