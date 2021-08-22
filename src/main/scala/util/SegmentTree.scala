package util

trait SegmentTree {
  val value: Int
  val left: Int
  val right: Int

  def sum(left: Int, right: Int): Int
}

object SegmentTree {

  case class Node(
      value: Int,
      left: Int,
      right: Int,
      leftNode: SegmentTree,
      rightNode: SegmentTree
  ) extends SegmentTree {
    override def sum(left: Int, right: Int): Int = {
      if (left > this.right || right < this.left) 0
      else if (left <= this.left && this.right <= right) this.value
      else leftNode.sum(left, right) + rightNode.sum(left, right)
    }
  }

  case class Leaf(value: Int, left: Int, right: Int) extends SegmentTree {
    override def sum(left: Int, right: Int): Int =
      if ((left to right) contains this.left) this.value else 0
  }

  def apply(nums: Array[Int]): SegmentTree =
    SegmentTree(nums, 0, nums.length - 1)

  private def apply(nums: Array[Int], left: Int, right: Int): SegmentTree =
    if (left >= right) Leaf(nums(left), left, right)
    else {
      val mid = (left + right) / 2
      val lNode = SegmentTree(nums, left, mid)
      val rNode = SegmentTree(nums, mid + 1, right)
      Node(lNode.value + rNode.value, left, right, lNode, rNode)
    }
}
