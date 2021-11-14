package leetcode.codingchallenge2021.november

import leetcode.LeetCodeSpec

class CombinationIteratorSpec extends LeetCodeSpec {
  test("Test of CombinationIterator 1") {
    val itr = new CombinationIterator("abc", 2)
    itr.next() shouldBe "ab"
    itr.hasNext() shouldBe true
    itr.next() shouldBe "ac"
    itr.hasNext() shouldBe true
    itr.next() shouldBe "bc"
    itr.hasNext() shouldBe false
  }
  test("Test of CombinationIterator 2") {
    val itr = new CombinationIterator("adhix", 3)
    itr.next() shouldBe "adh"
    itr.hasNext() shouldBe true
    itr.next() shouldBe "adi"
    itr.hasNext() shouldBe true
    itr.next() shouldBe "adx"
    itr.hasNext() shouldBe true
  }
}
