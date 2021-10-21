package leetcode.codingchallenge2021.october

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class RandomizedSet {
  private val storage = ArrayBuffer[Int]()
  private var indices = Map[Int, Int]()
  var length = 0

  def insert(n: Int): Boolean = indices.get(n) match {
    case None =>
      if (this.length < storage.length) storage(this.length) = n
      else storage += n
      this.length += 1
      indices += ((n, this.length - 1))
      true
    case Some(_) => false
  }

  def remove(n: Int): Boolean = indices.get(n) match {
    case None => false
    case Some(i) =>
      val last = storage(this.length - 1)
      storage(i) = last
      indices += ((last, i))
      indices -= n
      this.length -= 1
      true
  }
  def getRandom: Int = {
    val i = Random.nextInt(this.length)
    storage(i)
  }
}
