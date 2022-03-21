package leetcode.codingchallenge2022.mar

// 763. Partition Labels
object P763 {
  def partitionLabels(s: String): List[Int] = {
    val lastIndexOf = s.indices.foldLeft(Map[Char, Int]()) { (acc, i) => acc + (s(i) -> i) }
    var maxInd, len = 0
    val buffer = collection.mutable.ListBuffer[Int]()
    for (i <- s.indices) {
      len += 1
      maxInd = maxInd max lastIndexOf(s(i))
      if (maxInd <= i) {
        buffer += len
        len = 0
      }
    }
    buffer.result()
  }
}
