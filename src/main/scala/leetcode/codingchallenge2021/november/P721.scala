package leetcode.codingchallenge2021.november

// 721. Accounts Merge
object P721 {

  def accountsMerge(accounts: List[List[String]]): List[List[String]] = {
    val map = collection.mutable.Map[String, List[Set[String]]]().withDefaultValue(List.empty[Set[String]])
    for ((name, lists) <- accounts.groupBy(_.head)) {
      val ds = new DisjointSet
      for (_ :: email1 :: emailList <- lists; email2 <- emailList) ds.union(email1, email2)
      for (_ :: emailList <- lists) map(name) = merge(ds, map(name), emailList)
    }
    for ((name, setList) <- map.toList; mails <- setList) yield name :: mails.toList.sorted
  }

  @scala.annotation.tailrec
  private def merge(
      ds: DisjointSet,
      mailSetList: List[Set[String]],
      emailList: List[String],
      acc: List[Set[String]] = Nil
  ): List[Set[String]] =
    mailSetList match {
      case Nil => emailList.toSet :: acc
      case set :: rest =>
        if (ds.same(emailList.head, set.head)) (set ++ emailList) :: rest ::: acc
        else merge(ds, rest, emailList, set :: acc)
    }

  class DisjointSet {
    private val parent = collection.mutable.Map[String, String]().withDefault(it => it)

    def same(x: String, y: String): Boolean = findSet(x) == findSet(y)

    def union(x: String, y: String): Unit = if (!same(x, y)) {
      link(findSet(x), findSet(y))
    }

    private def findSet(x: String): String = {
      if (parent(x) != x) parent(x) = findSet(parent(x))
      parent(x)
    }

    private def link(x: String, y: String): Unit = parent(x) = y
  }
}
