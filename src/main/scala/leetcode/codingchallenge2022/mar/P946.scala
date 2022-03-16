package leetcode.codingchallenge2022.mar

// 946. Validate Stack Sequences
object P946 {
  def validateStackSequences(pushed: Array[Int], popped: Array[Int]): Boolean = {
    val indexOfN = pushed.indices.foldLeft(Map[Int, Int]()) { (acc, i) => acc + (pushed(i) -> i) }
    for (pi <- popped.indices) {
      val i = indexOfN(popped(pi))
      var minIndex = i
      for (pj <- pi + 1 until popped.length) {
        val j = indexOfN(popped(pj))
        if (j < i && j > minIndex) return false
        minIndex = minIndex min j
      }
    }
    true
  }
}
