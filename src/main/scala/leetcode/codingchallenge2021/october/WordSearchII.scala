package leetcode.codingchallenge2021.october

import scala.util.chaining.scalaUtilChainingOps

object WordSearchII {
  def findWords(board: Array[Array[Char]], words: Array[String]): List[String] = {

    def backtracking(i: Int, j: Int, current: Trie.Node, currLen: Int): Unit =
      if (currLen < 10 && i < board.length && i >= 0 && j < board(0).length && j >= 0 && board(i)(j) != '.') {
        val c = board(i)(j)
        val ci = c - 'a'
        val next = current.children(ci) match {
          case Trie.Empty      => (new Trie.Node).tap(current.children(ci) = _)
          case node: Trie.Node => node
        }
        board(i)(j) = '.'
        backtracking(i - 1, j, next, currLen + 1)
        backtracking(i + 1, j, next, currLen + 1)
        backtracking(i, j - 1, next, currLen + 1)
        backtracking(i, j + 1, next, currLen + 1)
        board(i)(j) = c
      }

    val trie = new Trie.Node
    for (i <- board.indices; j <- board(i).indices) {
      backtracking(i, j, trie, 0)
    }

    words.filter(trie.search).toList
  }

  abstract sealed class Trie

  object Trie {
    case class Node() extends Trie {
      val children: Array[Trie] = Array.fill[Trie]('z' - 'a' + 1)(Empty)

      def search(word: String): Boolean = {
        var current = this
        for (c <- word) {
          current.children(c - 'a') match {
            case Empty         => return false
            case node @ Node() => current = node
          }
        }
        true
      }
    }
    case object Empty extends Trie
  }
}
