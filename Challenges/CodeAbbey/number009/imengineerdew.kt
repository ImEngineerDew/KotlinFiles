/*
$ kotlinc imengineerdew.kt -include-runtime -d imengineerdew.jar
*/

import java.util.Scanner

fun main() {
  val element = Scanner(System.`in`)
  val size = element.nextInt()

  val i = 0

  val sideA = arrayOfNulls<Long>(size)
  val sideB = arrayOfNulls<Long>(sideA.size)
  val sideC = arrayOfNulls<Long>(sideA.size)

  tr(sideA, sideB, sideC, element, i)
  checkS(sideA, sideB, sideC, i)
}

fun tr(A: Array<Long?>, B: Array<Long?>, C: Array<Long?>, s: Scanner, i: Int) {
  if (i == A.size || i == B.size || i == C.size) {
    return
  }
  A[i] = s.nextLong()
  B[i] = s.nextLong()
  C[i] = s.nextLong()

  tr(A, B, C, s, i + 1)
}

fun checkS(sdA: Array<Long?>, sdB: Array<Long?>, sdC: Array<Long?>, i: Int) {
  if (i == sdA.size || i == sdB.size || i == sdC.size) {
    return
  }
  if (sdA[i]!! + sdB[i]!! > sdC[i]!!) {
    if (sdA[i]!! + sdC[i]!! > sdB[i]!!) {
      if (sdB[i]!! + sdC[i]!! > sdA[i]!!) {
        print(1.toString() + " ")
      } else {
        print(0.toString() + " ")
      }
    } else {
      print(0.toString() + " ")
    }
  } else {
    print(0.toString() + " ")
  }
  checkS(sdA, sdB, sdC, i + 1)
}

/*
$ cat DATA.lst | java -jar imengineerdew.jar
1 0 1 0 0 0 0 1 0 1 1 1 1 0 0 1 1 1 0 1 0
*/
