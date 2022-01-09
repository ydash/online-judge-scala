package leetcode.codingchallenge2022.jan

// 1041. Robot Bounded In Circle
object P1041 {
  def isRobotBounded(instructions: String): Boolean = {
    val initState: ((Int, Int), Direction) = (0, 0) -> North
    val (p, d) = instructions.foldLeft(initState) { case (((x, y), d), c) =>
      c match {
        case 'L' => (x, y) -> d.rotateLeft
        case 'R' => (x, y) -> d.rotateRight
        case _ =>
          d match {
            case North => (x, y + 1) -> d
            case South => (x, y - 1) -> d
            case East  => (x + 1, y) -> d
            case West  => (x - 1, y) -> d
          }
      }
    }
    p == (0, 0) || d != North
  }

  private sealed trait Direction {
    def rotateLeft: Direction = this match {
      case North => West
      case South => East
      case East  => North
      case West  => South
    }
    def rotateRight: Direction = this match {
      case North => East
      case South => West
      case East  => South
      case West  => North
    }
  }
  private case object North extends Direction
  private case object South extends Direction
  private case object East extends Direction
  private case object West extends Direction
}
