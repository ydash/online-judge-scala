package leetcode.codingchallenge2021.september

import scala.collection.mutable

object UniqueEmailAddresses {
  def numUniqueEmails(emailList: Array[String]): Int = {
    val seen = mutable.Map[String, mutable.Set[String]]()
    for (email <- emailList) {
      val (localName, domainName) = email.span(_ != '@')
      seen.get(domainName) match {
        case None      => seen += (domainName -> mutable.Set(applyRule(localName)))
        case Some(set) => set += applyRule(localName)
      }
    }

    seen.foldLeft(0) { case (acc, (_, set)) => acc + set.size }
  }

  private def applyRule(domainName: String): String = {
    val buffer = new mutable.StringBuilder()
    var i = 0
    while (i < domainName.length && domainName(i) != '+') {
      if (domainName(i) != '.') buffer += domainName(i)
      i += 1
    }
    buffer.toString()
  }
}
