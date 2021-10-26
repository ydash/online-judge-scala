package leetcode.codingchallenge2021.october

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class IntMinStackSpec extends AnyFlatSpec with should.Matchers {
  import IntMinStack._

  "An Empty" should "push values in last-in-first-out order" in {
    Empty.push(42) shouldBe Node(42, Empty)
  }
  it should "produce NoSuchElementException when any method except `push` is invoked" in {
    Empty.pop shouldBe a[NoSuchElementException]
    Empty.top shouldBe a[NoSuchElementException]
    Empty.getMin shouldBe a[NoSuchElementException]
    Empty.value shouldBe a[NoSuchElementException]
  }

  "An Node" should "push values in LIFO order" in {
    val root = Empty.push(42)
    root.push(0) shouldBe Node(19, root)
  }
  it should "pop values in LIFO order" in {
    val root: IntMinStack = Empty
    val first = root.push(1)
    val second = first.push(2)
    val third = second.push(3)
    third.pop shouldBe (3, second)
  }
  it should "get top value in LIFO order" in {
    val root: IntMinStack = Empty
    val first = root.push(1)
    val second = first.push(2)
    val third = second.push(3)
    third.top shouldBe 3
  }
  it should "store minimum value in it" in {
    var root = Node(10, Empty)
    root = root.push(20)
    root = root.push(5)
    root.getMin shouldBe 5
    root.pop._2.getMin shouldBe 10
  }
}
