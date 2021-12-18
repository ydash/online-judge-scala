package leetcode.codingchallenge2021.december

// 902. Numbers At Most N Given Digit Set
object P902 {
  def atMostNGivenDigitSet(_digits: Array[String], n: Int): Int = {
    val digits = _digits.map(_.toInt)
    val nd = n.toString.map(_.getNumericValue)
    var result = (1 until nd.length).foldLeft(0) { (acc, i) => acc + Math.pow(digits.length, i).toInt }
    for (i <- nd.indices) {
      result += digits.count(_ < nd(i)) * Math.pow(digits.length, nd.length - i - 1).toInt
      if (!digits.contains(nd(i))) return result
    }
    result + 1
  }
}
