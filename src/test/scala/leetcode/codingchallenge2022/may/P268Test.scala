package leetcode.codingchallenge2022.may

import leetcode.LeetCodeSpec

// 268. Missing Number
class P268Test extends LeetCodeSpec {
  private val table = Table(
    ("nums", "expected"),
    (Array(0), 1),
    (Array(2, 0, 1), 3),
    (Array(0, 1), 2),
    (Array(9, 6, 4, 2, 3, 5, 7, 0, 1), 8)
  )
}
