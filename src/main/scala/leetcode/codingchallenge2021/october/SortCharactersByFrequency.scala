package leetcode.codingchallenge2021.october

object SortCharactersByFrequency {
  def frequencySort(s: String): String = {
    val frequency = s.foldLeft(Map[Char, Int]().withDefaultValue(0)) { (acc, c) =>
      acc.updated(c, acc(c) + 1)
    }
    val buffer = new StringBuilder()
    for ((c, freq) <- frequency.toSeq.sortBy(-_._2)) {
      buffer ++= (c.toString * freq)
    }
    buffer.toString()
  }
}
