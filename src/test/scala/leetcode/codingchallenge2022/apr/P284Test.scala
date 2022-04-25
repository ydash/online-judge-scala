package leetcode.codingchallenge2022.apr

import leetcode.LeetCodeSpec

class P284Test extends LeetCodeSpec {
  test("Test of Peeking Iterator") {
    val peekingIterator = new P284.PeekingIterator(Iterator(1, 2, 3)); // [1,2,3]
    peekingIterator.next() shouldBe 1
    peekingIterator.peek() shouldBe 2
    peekingIterator.peek() shouldBe 2
    peekingIterator.next() shouldBe 2
    peekingIterator.next() shouldBe 3
    peekingIterator.hasNext shouldBe false
  }
}
