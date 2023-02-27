package leetcode.codingchallenge2023.feb

object P427 {
  def construct(grid: Array[Array[Int]]): Node = {
    val n = grid.length
    for (i <- 1 until n) {
      grid(i)(0) += grid(i - 1)(0)
      grid(0)(i) += grid(0)(i - 1)
    }
    for (i <- 1 until n; j <- 1 until n) grid(i)(j) += grid(i - 1)(j) + grid(i)(j - 1) - grid(i - 1)(j - 1)
    def aux(x0: Int, y0: Int, x: Int): Node = {
      val sum =
        if (x0 == 0 && y0 == 0) grid(x - 1)(x - 1)
        else if (x0 == 0) grid(x0 + x - 1)(y0 + x - 1) - grid(x0 + x - 1)(y0 - 1)
        else if (y0 == 0) grid(x0 + x - 1)(y0 + x - 1) - grid(x0 - 1)(y0 + x - 1)
        else grid(x0 + x - 1)(y0 + x - 1) - grid(x0 + x - 1)(y0 - 1) - grid(x0 - 1)(y0 + x - 1) + grid(x0 - 1)(y0 - 1)
      if (sum == x * x || sum == 0)
        new Node(!(sum == 0), true)
      else {
        val node = new Node(true, false)
        node.topLeft = aux(x0, y0, x / 2)
        node.topRight = aux(x0, y0 + x / 2, x / 2)
        node.bottomLeft = aux(x0 + x / 2, y0, x / 2)
        node.bottomRight = aux(x0 + x / 2, y0 + x / 2, x / 2)
        node
      }
    }
    aux(0, 0, n)
  }

  object Node {
    def apply(
        value: Boolean,
        isLeaf: Boolean,
        topLeft: Node,
        topRight: Node,
        bottomLeft: Node,
        bottomRight: Node
    ): Node = {
      val node = new Node(value, isLeaf)
      node.topLeft = topLeft
      node.topRight = topRight
      node.bottomLeft = bottomLeft
      node.bottomRight = bottomRight
      node
    }
  }

  class Node(var _value: Boolean, var _isLeaf: Boolean) {
    var value: Boolean = _value
    var isLeaf: Boolean = _isLeaf
    var topLeft: Node = null
    var topRight: Node = null
    var bottomLeft: Node = null
    var bottomRight: Node = null

    override def toString: String = {
      if (isLeaf) s"Node($value,$isLeaf)"
      else s"Node($value,$isLeaf,$topLeft,$topRight,$bottomLeft,$bottomRight)"
    }

    override def equals(obj: Any): Boolean = {
      obj match {
        case that: Node =>
          this.value == that.value && this.isLeaf == that.isLeaf && this.topLeft == that.topLeft && this.topRight == that.topRight && this.bottomLeft == that.bottomLeft && this.bottomRight == that.bottomRight
        case _ => false
      }
    }
  }

}
