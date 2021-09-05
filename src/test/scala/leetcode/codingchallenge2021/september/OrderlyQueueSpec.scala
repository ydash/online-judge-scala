package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class OrderlyQueueSpec extends LeetCodeSpec {
  private val table = Table(
    ("s", "k", "expected"),
    ("cba", 1, "acb"),
    ("baaca", 3, "aaabc"),
    ("abcadeafga", 1, "aabcadeafg"),
    ("adeabcafg", 1, "abcafgade")
  )

  test("Test of Orderly Queue") {
    forAll(table) { (s, k, expected) =>
      OrderlyQueue.orderlyQueue(s, k) shouldBe expected
    }
  }
}
