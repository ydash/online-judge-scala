package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

class P474Test extends LeetCodeSpec {
  private val table = Table(
    ("strs", "m", "n", "expected"),
    (Array("10", "0001", "111001", "1", "0"), 5, 3, 4),
    (Array("10", "0", "1"), 1, 1, 2),
    (Array("00", "11"), 1, 1, 0)
  )

  test("Test of Ones and Zeroes") {
    forAll(table) { (strs, m, n, expected) =>
      P474.findMaxForm(strs, m, n) shouldBe expected
    }
  }
}
