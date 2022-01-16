package leetcode.codingchallenge2022.jan

// 1345. Jump Game IV
object P1345 {
  def minJumps(arr: Array[Int]): Int = {
    val indicesOf = collection.mutable.Map[Int, List[Int]]().withDefaultValue(Nil)
    for (i <- arr.indices) indicesOf(arr(i)) = i :: indicesOf(arr(i))

    val goal = arr.length - 1
    val visited = new Array[Boolean](arr.length)
    visited(0) = true
    val queue = collection.mutable.Queue[Int](0)
    for (step <- arr.indices) {
      val len = queue.length
      for (_ <- 0 until len) {
        val i = queue.dequeue()
        if (i == goal) return step
        if (i - 1 > 0 && !visited(i - 1)) {
          queue += i - 1
          visited(i - 1) = true
        }
        if (i + 1 < arr.length && !visited(i + 1)) {
          queue += i + 1
          visited(i + 1) = true
        }
        for (j <- indicesOf(arr(i)) if !visited(j)) {
          queue += j
          visited(j) = true
        }
        indicesOf(arr(i)) = Nil
      }
    }
    arr.length
  }
}
