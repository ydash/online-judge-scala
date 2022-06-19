package leetcode.codingchallenge2022.jun

import leetcode.LeetCodeSpec

class P1268Test extends LeetCodeSpec {
  private val table = Table(
    ("products", "searchWord", "expected"),
    (Array("baz", "bar"), "foo", List(List(), List(), List())),
    (
      Array("mobile", "mouse", "moneypot", "monitor", "mousepad"),
      "mouse",
      List(
        List("mobile", "moneypot", "monitor"),
        List("mobile", "moneypot", "monitor"),
        List("mouse", "mousepad"),
        List("mouse", "mousepad"),
        List("mouse", "mousepad")
      )
    ),
    (
      Array("havana"),
      "havana",
      List(List("havana"), List("havana"), List("havana"), List("havana"), List("havana"), List("havana"))
    ),
    (
      Array("bags", "baggage", "banner", "box", "cloths"),
      "bags",
      List(List("baggage", "bags", "banner"), List("baggage", "bags", "banner"), List("baggage", "bags"), List("bags"))
    )
  )

  test("Test of Search Suggestions System") {
    forAll(table) { (products, searchWord, expected) =>
      P1268.suggestedProducts(products, searchWord) shouldBe expected
    }
  }
}
