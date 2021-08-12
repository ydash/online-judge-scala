package leetcode.codingchallenge2021.august

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val map = new mutable.HashMap[String, ListBuffer[String]]()
    strs.foreach { str =>
      map.get(str.sorted) match {
        case None => map += str.sorted -> ListBuffer(str)
        case Some(buffer) => buffer += str
      }
    }
    for ((_, buffer) <- map.toList) yield buffer.toList
  }
}
