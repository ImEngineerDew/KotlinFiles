/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.kt
*/

import java.util.Scanner

fun sumAplusB(valA: Int, valB: Int): Int {
  return valA + valB
}

fun main() {
  val obj = Scanner(System.`in`)
  val a = obj.nextInt()
  val b = obj.nextInt()
  val res = sumAplusB(a, b)
  print(res)
}

/*
$ cat DATA.lst | java -jar imengineerdew.jar
23510
*/
