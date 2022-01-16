package leetcode.codingchallenge2022.jan

// 849. Maximize Distance to Closest Person
object P849 {
  def maxDistToClosest(seats: Array[Int]): Int = {
    var i, result = seats.indexWhere(_ == 1)
    for (j <- i + 1 until seats.length if seats(j) == 1) {
      result = result max (j - i) / 2
      i = j
    }
    result max (seats.length - 1 - i)
  }
}
