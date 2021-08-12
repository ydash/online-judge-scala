package leetcode.codingchallenge2021.august

import scala.collection.mutable

object GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val map = new mutable.HashMap[String, List[String]]().withDefaultValue(List.empty)
    for (str <- strs; sortedStr = str.sorted) map += sortedStr -> (str :: map(sortedStr))
    map.values.toList
  }
}
