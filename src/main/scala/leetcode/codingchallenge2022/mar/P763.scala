package leetcode.codingchallenge2022.mar

// 763. Partition Labels
object P763 {
  def partitionLabels(s: String): List[Int] = {
    val lastIndexOf = s.indices.foldLeft(Map[Char, Int]()) { (acc, i) => acc + (s(i) -> i) }
    var current = 0
    val buffer = collection.mutable.ListBuffer[Int]()
    while (current < s.length) {
      val startInd = current
      var lastInd = lastIndexOf(s(current))
      do {
        val tmp = lastInd
        lastInd = (current to lastInd).map(i => lastIndexOf(s(i))).max
        current = tmp + 1
      } while (current <= lastInd)
      buffer += (lastInd - startInd + 1)
    }
    buffer.result()
  }
}
