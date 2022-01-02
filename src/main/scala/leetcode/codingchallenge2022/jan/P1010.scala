package leetcode.codingchallenge2022.jan

// 1010. Pairs of Songs With Total Durations Divisible by 60
object P1010 {
  def numPairsDivisibleBy60(time: Array[Int]): Int = {
    val cache = new Array[Int](60)
    var answer = 0
    for (t <- time) {
      answer += cache((60 - t % 60) % 60)
      cache(t % 60) += 1
    }
    answer
  }
}
