package leetcode.codingchallenge2022.feb

// 165. Compare Version Numbers
object P165 {
  def compareVersion(version1: String, version2: String): Int = compare(parse(version1), parse(version2))

  @scala.annotation.tailrec
  private def compare(l1: List[Int], l2: List[Int]): Int = (l1, l2) match {
    case (Nil, Nil) => 0
    case (Nil, _)   => if (l2.forall(_ == 0)) 0 else -1
    case (_, Nil)   => if (l1.forall(_ == 0)) 0 else 1
    case (h1 :: t1, h2 :: t2) =>
      if (h1 < h2) -1
      else if (h1 > h2) 1
      else compare(t1, t2)
  }

  private def parse(version: String): List[Int] = version.split('.').map(_.toInt).toList
}
