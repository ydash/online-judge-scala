package leetcode.codingchallenge2022.apr

// 706. Design HashMap
object P706 {
  class MyHashMap() {
    import MyHashMap._
    import scala.collection.mutable
    private val store = Array.fill[mutable.ArrayDeque[(Int, Int)]](TABLE_SIZE)(mutable.ArrayDeque())

    def put(key: Int, value: Int): Unit = {
      val hash = myHash(key)
      val i = store(hash).indexWhere(_._1 == key)
      if (i != -1) store(hash)(i) = (key, value)
      else store(hash) += (key -> value)
    }

    def get(key: Int): Int =
      store(myHash(key))
        .find(_._1 == key)
        .map(_._2)
        .getOrElse(-1)

    def remove(key: Int): Unit = {
      store(myHash(key)).removeFirst(_._1 == key)
    }

  }

  object MyHashMap {
    private val TABLE_SIZE = 10_000
    private def myHash(value: Int): Int = value % TABLE_SIZE
  }

}
