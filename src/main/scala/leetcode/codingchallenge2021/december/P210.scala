package leetcode.codingchallenge2021.december

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

// 210. Course Schedule II
object P210 {
  def findOrder(numCourses: Int, prerequisites: Array[Array[Int]]): Array[Int] = {
    val children = Array.fill[List[Int]](numCourses)(Nil)
    val numOfParent = new Array[Int](numCourses)
    for (Array(a, b) <- prerequisites) {
      children(b) = a :: children(b)
      numOfParent(a) += 1
    }
    val queue = new mutable.Queue[Int]()
    for (i <- numOfParent.indices if numOfParent(i) == 0) queue += i
    val result = ArrayBuffer[Int]()
    while (queue.nonEmpty) {
      val i = queue.dequeue()
      if (numOfParent(i) == 0) result += i
      for (j <- children(i)) {
        numOfParent(j) -= 1
        if (numOfParent(j) == 0) queue += j
      }
    }
    if (result.length == numCourses) result.toArray else Array.empty
  }
}
