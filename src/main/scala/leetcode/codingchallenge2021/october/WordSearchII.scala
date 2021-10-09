package leetcode.codingchallenge2021.october

import scala.collection.mutable
import scala.util.chaining.scalaUtilChainingOps

object WordSearchII {
  def findWords(board: Array[Array[Char]], words: Array[String]): List[String] = {
    val result = new mutable.HashSet[String]()

    def backtracking(i: Int, j: Int, current: Trie): Unit =
      if (board(i)(j) != '.') {
        val c = board(i)(j)
        current.children(c - 'a').foreach { next =>
          if (next.word.nonEmpty) result += next.word
          board(i)(j) = '.'
          if (i > 0) backtracking(i - 1, j, next)
          if (i < board.length - 1) backtracking(i + 1, j, next)
          if (j > 0) backtracking(i, j - 1, next)
          if (j < board.head.length - 1) backtracking(i, j + 1, next)
          board(i)(j) = c
        }
      }

    val trie = buildTrie(words)
    for (i <- board.indices; j <- board(i).indices) {
      backtracking(i, j, trie)
    }

    result.toList
  }

  private def buildTrie(words: Array[String]): Trie = {
    val root = new Trie
    for (word <- words) root.insert(word)
    root
  }

  class Trie {
    val children: Array[Option[Trie]] = Array.fill(26)(None)
    var word = ""

    def insert(word: String): Unit = {
      var current = this
      for (c <- word) {
        current = current.children(c - 'a') match {
          case Some(node) => node
          case None       => (new Trie).tap(node => current.children(c - 'a') = Some(node))
        }
      }
      current.word = word
    }

    def search(word: String): Boolean = {
      var current = this
      for (c <- word) {
        current.children(c - 'a') match {
          case None       => return false
          case Some(node) => current = node
        }
      }
      true
    }
  }
}
