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

}