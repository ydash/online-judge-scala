package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class P721Test extends LeetCodeSpec {
  private val table = Table(
    ("accounts", "expected"),
    (
      List(
        List("John", "johnsmith@mail.com", "john_newyork@mail.com"),
        List("John", "johnsmith@mail.com", "john00@mail.com"),
        List("Mary", "mary@mail.com"),
        List("John", "johnnybravo@mail.com")
      ),
      List(
        List("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
        List("Mary", "mary@mail.com"),
        List("John", "johnnybravo@mail.com")
      )
    ),
    (
      List(
        List("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
        List("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
        List("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
        List("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
        List("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co")
      ),
      List(
        List("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
        List("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
        List("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
        List("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co"),
        List("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co")
      )
    ),
    (
      List(
        List("David", "David0@m.co", "David1@m.co"),
        List("David", "David3@m.co", "David4@m.co"),
        List("David", "David4@m.co", "David5@m.co"),
        List("David", "David2@m.co", "David3@m.co"),
        List("David", "David1@m.co", "David2@m.co")
      ),
      List(List("David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co"))
    ),
    (
      List(
        List("David", "David5@m.co", "David8@m.co"),
        List("David", "David1@m.co", "David1@m.co", "David8@m.co"),
        List("David", "David0@m.co", "David0@m.co", "David5@m.co")
      ),
      List(List("David", "David0@m.co", "David1@m.co", "David5@m.co", "David8@m.co"))
    )
  )

  test("Test of Accounts Merge") {
    forAll(table) { (accounts, expected) =>
      P721.accountsMerge(accounts) should contain theSameElementsAs expected
    }
  }
}
