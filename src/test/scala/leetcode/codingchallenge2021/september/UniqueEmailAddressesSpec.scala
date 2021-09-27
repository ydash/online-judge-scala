package leetcode.codingchallenge2021.september

import leetcode.LeetCodeSpec

class UniqueEmailAddressesSpec extends LeetCodeSpec {
  private val table = Table(
    ("emails", "expected"),
    (Array("test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"), 2),
    (Array("a@leetcode.com", "b@leetcode.com", "c@leetcode.com"), 3)
  )

  test("Test of Unique Email Addresses") {
    forAll(table) { (emails, expected) =>
      UniqueEmailAddresses.numUniqueEmails(emails) shouldBe expected
    }
  }
}
