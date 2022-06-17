package leetcode.codingchallenge2022.jun

import util.TreeNode

// 968. Binary Tree Cameras
object P968 {
  def minCameraCover(root: TreeNode): Int = {
    import Status._
    def dfs(current: TreeNode): Status = {
      if (current == null) Monitored(0)
      else {
        val left = dfs(current.left)
        val right = dfs(current.right)
        (left, right) match {
          case (_: Unmonitored, _) | (_, _: Unmonitored) => Camera(left.sum + right.sum + 1)
          case (_: Camera, _) | (_, _: Camera)           => Monitored(left.sum + right.sum)
          case _                                         => Unmonitored(left.sum + right.sum)
        }
      }
    }
    dfs(root) match {
      case Unmonitored(sum) => sum + 1
      case result           => result.sum
    }
  }

  sealed trait Status {
    val sum: Int
  }
  object Status {
    case class Monitored(sum: Int) extends Status
    case class Camera(sum: Int) extends Status
    case class Unmonitored(sum: Int) extends Status
  }
}
