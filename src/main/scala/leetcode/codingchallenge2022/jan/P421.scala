package leetcode.codingchallenge2022.jan

// 421. Maximum XOR of Two Numbers in an Array
object P421 {
  def findMaximumXOR(nums: Array[Int]): Int = {
    var result, mask = 0
    for (i <- (0 to 31).reverse) {
      mask = mask | (1 << i)
      val set = nums.foldLeft(Set.empty[Int]) { (acc, n) => acc + (n & mask) }
      val expect = result | (1 << i)
      for (m <- set if set.contains(m ^ expect)) {
        result = expect
      }
    }
    result
  }
}
