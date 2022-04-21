package leetcode.codingchallenge2022.apr

// 705. Design HashSet
object P705 {

  class MyHashSet() {
    import MyHashSet._
    import collection.mutable.ArrayBuffer
    private val store = Array.fill[ArrayBuffer[Int]](TABLE_SIZE)(ArrayBuffer.empty)

    def add(key: Int): Unit =
      if (!contains(key)) {
        store(myHash(key)) += key
      }

    def remove(key: Int): Unit = {
      store(myHash(key)) -= key
    }

    def contains(key: Int): Boolean = store(myHash(key)).contains(key)

  }

  object MyHashSet {
    private val A = 51899
    private val R = 14
    private val TABLE_SIZE = 1 << R
    private val W = 16

    private def myHash(value: Int): Int = hash(A, value, W, R).toInt

    private def hash(a: Long, k: Int, w: Int, r: Int): Long =
      ((a * k) % (1 << w)) >> (w - r)
  }
}
