package leetcode.codingchallenge2022.may

// 354. Russian Doll Envelopes
object P354 {
  def maxEnvelopes(envelopes: Array[Array[Int]]): Int = {
    envelopes.sortInPlace()((x: Array[Int], y: Array[Int]) =>
      if (x(0) == y(0)) y(1) compare x(1)
      else x(0) compare y(0)
    )
    val buffer = collection.mutable.ArrayBuffer[Int](envelopes(0)(1))

    for (Array(_, h) <- envelopes) {
      if (h > buffer.last) buffer += h
      else buffer(buffer.search(h, 0, buffer.length - 1).insertionPoint) = h
    }

    buffer.length
  }
}
