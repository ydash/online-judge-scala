package leetcode.codingchallenge2021.october

import leetcode.LeetCodeSpec

class DungeonGameSpec extends LeetCodeSpec {
  private val table = Table(
    ("dungeon", "expected"),
    (Array(Array(-2, -3, 3), Array(-5, -10, 1), Array(10, 30, -5)), 7),
    (Array(Array(0)), 1)
  )

  test("Test of Dungeon Game") {
    forAll(table) { (dungeon, expected) =>
      DungeonGame.calculateMinimumHP(dungeon) shouldBe expected
    }
  }
}
