package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class MaximumNumberOfBalloonsSpec extends LeetCodeSpec {
  private val table = Table(
    ("text", "expected"),
    ("nlaebolko", 1),
    ("loonbalxballpoon", 2),
    ("leetcode", 0),
    ("balllloooon", 1)
  )

  test("Test of Maximum Number of Balloons") {
    forAll(table) { (text, expected) =>
      MaximumNumberOfBalloons.maxNumberOfBalloons(text) shouldBe expected
    }
  }
}
