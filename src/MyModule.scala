/**
  * Project: firstmyscala
  * FileName: MyModule
  * Date: 2016-11-30
  * Time: 오후 2:11
  * Author: Hadeslee 
  * Note:
  * To change this template use File | Settings | File Templates.
  */
object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-35))

    println(formatFactorial(5))
}



