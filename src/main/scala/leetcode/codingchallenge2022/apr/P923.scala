package leetcode.codingchallenge2022.apr

// 923. 3Sum With Multiplicity
object P923 {
  def threeSumMulti(arr: Array[Int], target: Int): Int = {
    val mod = 1000000007
    val count = new Array[Long](101)
    for (n <- arr) count(n) += 1
    var sum = 0L
    for {
      i <- count.indices
      j <- i until count.length
    } {
      val k = target - i - j
      if (i <= j && j <= k && k <= 100) {
        if (i == j && j == k) sum += count(i) * (count(i) - 1) * (count(i) - 2) / 6
        else if (i == j) sum += count(i) * (count(i) - 1) / 2 * count(k)
        else if (j == k) sum += count(i) * count(k) * (count(k) - 1) / 2
        else sum += count(i) * count(j) * count(k)
      }
    }
    (sum % mod).toInt
  }
}
