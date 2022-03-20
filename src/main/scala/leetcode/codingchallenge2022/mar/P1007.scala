package leetcode.codingchallenge2022.mar

// 1007. Minimum Domino Rotations For Equal Row
object P1007 {
  def minDominoRotations(tops: Array[Int], bottoms: Array[Int]): Int = {
    tops.indices
      .foldLeft((1 to 6).toSet) { (acc, i) => acc intersect Set(tops(i), bottoms(i)) }
      .headOption
      .map { n =>
        val (countTop, countBottom) = tops.indices.foldLeft((0, 0)) { case ((tc, bc), i) =>
          (if (tops(i) == n) tc + 1 else tc, if (bottoms(i) == n) bc + 1 else bc)
        }
        tops.length - (countTop max countBottom)
      }
      .getOrElse(-1)
  }
}
