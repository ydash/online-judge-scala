package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1647Test extends LeetCodeSpec {
  private val table = Table(
    ("s", "expected"),
    ("aab", 0),
    ("aaabbbcc", 2),
    ("ceabaacb", 2),
    ("abcdefg", 6),
    ("accdcdadddbaadbc", 1)
  )

  test("Test of Minimum Deletions to Make Character Frequencies Unique") {
    forAll(table) { (s, expected) =>
      P1647.minDeletions(s) shouldBe expected
    }
  }
}
