package leetcode.codingchallenge2022.may

// 318. Maximum Product of Word Lengths
object P318 {
  def maxProduct(words: Array[String]): Int = {
    val bits = words.map(_.foldLeft(0)((acc, c) => acc | (1 << (c - 'a'))))
    var maxProd = 0
    for (i <- words.indices; j <- i until words.length if (bits(i) & bits(j)) == 0) {
      maxProd = maxProd max (words(i).length * words(j).length)
    }
    maxProd
  }
}
