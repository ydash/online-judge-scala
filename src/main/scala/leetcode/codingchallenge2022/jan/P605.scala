package leetcode.codingchallenge2022.jan

// 605. Can Place Flowers
object P605 {
  def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
    var count = 0
    for {
      i <- flowerbed.indices
      if flowerbed(i) == 0
      if i == 0 || flowerbed(i - 1) == 0
      if i == flowerbed.length - 1 || flowerbed(i + 1) == 0
    } {
      count += 1
      flowerbed(i) = 1
    }
    n <= count
  }
}
