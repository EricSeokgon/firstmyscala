/**
  * Project: firstmyscala
  * FileName: polymorphic
  * Date: 2016-12-01
  * Time: 오후 4:42
  * Author: Hadeslee 
  * Note:
  * To change this template use File | Settings | File Templates.
  */
object polymorphic {
  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)

    loop(0)
  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean =
      if (n >= as.length) true
      else if (ordered(as(n),as(n+1))) false
      else loop(n + 1)
    loop(0)
  }
}
