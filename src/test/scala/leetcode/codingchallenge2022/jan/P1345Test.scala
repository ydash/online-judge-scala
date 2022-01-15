package leetcode.codingchallenge2022.jan

import leetcode.LeetCodeSpec

class P1345Test extends LeetCodeSpec {
  private val table = Table(
    ("arr", "expected"),
    (Array(100, -23, -23, 404, 100, 23, 23, 23, 3, 404), 3),
    (Array(42), 0),
    (Array(42, 1, 2, 3, 4, 5, 42), 1)
  )

  test("Test of Jump Game IV") {
    forAll(table) { (arr, expected) =>
      P1345.minJumps(arr) shouldBe expected
    }
  }
}
