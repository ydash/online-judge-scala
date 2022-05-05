package leetcode.codingchallenge2022.may

// 225. Implement Stack using Queues
object P225 {
  class MyStack() {
    private val queue = collection.mutable.Queue[Int]()

    def push(x: Int): Unit = {
      queue.enqueue(x)
      for (_ <- queue.indices.tail) queue.enqueue(queue.dequeue())
    }

    def pop(): Int = queue.dequeue()

    def top(): Int = queue.head

    def empty(): Boolean = queue.isEmpty

  }
}
