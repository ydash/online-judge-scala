package leetcode.codingchallenge2022.may

// 341. Flatten Nested List Iterator
object P341 {
  class NestedIterator(_nestedList: List[NestedInteger]) {
    private val stack = collection.mutable.Stack[NestedInteger](_nestedList: _*)
    private def preProc(): Unit = {
      def flattenTop(): Unit = {
        val nl = stack.pop().getList
        for (i <- nl.indices.reverse) stack.push(nl(i))
      }
      while (stack.nonEmpty && !stack.head.isInteger) flattenTop()
    }

    def next(): Int = {
      preProc()
      stack.pop().getInteger
    }

    def hasNext(): Boolean = {
      preProc()
      stack.nonEmpty
    }
  }

  trait NestedInteger {
    def isInteger: Boolean
    def getInteger: Int
    def getList: Array[NestedInteger]
  }
}
