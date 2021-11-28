package leetcode.codingchallenge2021.november

object P797 {
  def allPathsSourceTarget(graph: Array[Array[Int]]): List[List[Int]] = {
    val terminal = graph.length - 1
    @scala.annotation.tailrec
    def loop(stack: List[List[Int]], result: List[List[Int]]): List[List[Int]] = stack match {
      case Nil => result
      case path :: rest =>
        path match {
          case n :: _ if n == terminal => loop(rest, path.reverse :: result)
          case n :: _                  => loop(graph(n).foldLeft(rest)((acc, m) => (m :: path) :: acc), result)
        }
    }
    loop(List(List(0)), Nil)
  }
}
