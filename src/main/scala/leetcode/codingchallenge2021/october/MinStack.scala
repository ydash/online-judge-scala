package leetcode.codingchallenge2021.october

class MinStack() {
  import IntMinStack._
  private var root: IntMinStack = Empty

  def push(n: Int): Unit = {
    root = root.push(n)
  }

  def pop(): Int = {
    val (n, next) = root.pop
    root = next
    n
  }

  def top(): Int = root.value

  def getMin(): Int = root.getMin
}

trait IntMinStack {
  def push(n: Int): IntMinStack
  def pop: (Int, IntMinStack)
  def top: Int
  def getMin: Int
  def value: Int
}

object IntMinStack {
  case class Node(n: Int, next: IntMinStack) extends IntMinStack {
    override def push(n: Int): Node = Node(n, this)

    override def pop: (Int, IntMinStack) = (n, next)

    override def top: Int = n

    override val getMin: Int = next match {
      case Empty      => n
      case node: Node => n min node.getMin
    }

    override val value: Int = n
  }

  case object Empty extends IntMinStack {
    override def push(n: Int): Node = Node(n, this)

    override def pop: (Int, IntMinStack) = throw new NoSuchElementException()

    override def top: Int = throw new NoSuchElementException()

    override def getMin: Int = throw new NoSuchElementException()

    override def value: Int = throw new NoSuchElementException()
  }
}
