package leetcode.codingchallenge2022.mar

// 881. Boats to Save People
object P881 {
  def numRescueBoats(people: Array[Int], limit: Int): Int = {
    people.sortInPlace()
    var i, count = 0
    var j = people.length - 1
    while (i <= j) {
      if (people(i) + people(j) <= limit) {
        i += 1
        j -= 1
      } else {
        j -= 1
      }
      count += 1
    }
    count
  }
}
