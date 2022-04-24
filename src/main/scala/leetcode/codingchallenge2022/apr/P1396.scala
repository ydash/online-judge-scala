package leetcode.codingchallenge2022.apr

// 1396. Design Underground System
object P1396 {
  class UndergroundSystem() {
    import collection.mutable.{Map => MutableMap}
    private val checkInLog = MutableMap[Int, (String, Int)]()
    private val travelTimeCache = MutableMap[String, (Int, Int)]().withDefaultValue(0 -> 0)

    def checkIn(id: Int, start: String, time: Int): Unit = {
      checkInLog += (id -> (start, time))
    }

    def checkOut(id: Int, end: String, t2: Int): Unit = {
      val (start, t1) = checkInLog(id)
      val key = s"$start-$end"
      val diff = t2 - t1
      val (count, sum) = travelTimeCache(key)
      travelTimeCache(key) = (count + 1, sum + diff)
    }

    def getAverageTime(startStation: String, endStation: String): Double = {
      val (count, sum) = travelTimeCache(s"$startStation-$endStation")
      sum.toDouble / count
    }

  }
}
