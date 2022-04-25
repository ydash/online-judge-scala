package leetcode.codingchallenge2022.apr

// 284. Peeking Iterator
object P284 {
  class PeekingIterator(iterator: Iterator[Int]) {
    private var p = iterator.nextOption()

    def peek(): Int = p.getOrElse(-1)

    def next(): Int = {
      val next = p.getOrElse(-1)
      p = iterator.nextOption()
      next
    }

    def hasNext: Boolean = p.nonEmpty
  }
}
