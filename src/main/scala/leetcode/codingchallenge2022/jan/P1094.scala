package leetcode.codingchallenge2022.jan

// 1094. Car Pooling
object P1094 {
  def carPooling(trips: Array[Array[Int]], capacity: Int): Boolean = {
    val passenger = new Array[Int](1001)
    for (Array(p, from, to) <- trips) {
      passenger(from) += p
      passenger(to) -= p
    }
    for (i <- 1 to 1000) passenger(i) += passenger(i - 1)
    passenger.forall(_ <= capacity)
  }
}
