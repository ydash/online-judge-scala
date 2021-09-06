package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class SlowestKeySpec extends LeetCodeSpec {
  private val table = Table(
    ("releaseTimes", "keysPressed", "expected"),
    (Array(1, 42), "an", 'n'),
    (Array(9, 29, 49, 50), "cbcd", 'c'),
    (Array(12, 23, 36, 46, 62), "spuda", 'a')
  )

  test("Test of Slowest Key") {
    forAll(table) { (releasesTimes, keysPressed, expected) =>
      SlowestKey.slowestKey(releasesTimes, keysPressed) shouldBe expected
    }
  }
}
