package leetcode.codingchallenge2022.feb

// 338. Counting Bits
object P338 {
  def countBits(n: Int): Array[Int] = {
    val result = new Array[Int](n + 1)
    @scala.annotation.tailrec
    def loop(offset: Int): Unit = {
      if (offset <= n) {
        for (i <- 0 until (offset min (n - offset + 1))) {
          result(i + offset) = result(i) + 1
        }
        loop(offset << 1)
      }
    }
    loop(1)
    result
  }
}
