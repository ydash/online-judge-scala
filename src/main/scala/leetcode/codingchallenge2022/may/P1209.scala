package leetcode.codingchallenge2022.may

// 1209. Remove All Adjacent Duplicates in String II
object P1209 {
  def removeDuplicates(s: String, k: Int): String = {
    s.foldRight(Nil: List[(Char, Int)]) { (c, acc) =>
      acc match {
        case Nil                     => (c, 1) :: acc
        case (c2, _) :: _ if c != c2 => (c, 1) :: acc
        case (_, times) :: rest =>
          if (times + 1 == k) rest
          else (c, times + 1) :: rest
      }
    }.map { case (c, times) => c.toString * times }
      .mkString
  }
}
