import java.util.Scanner

fun main() {

    val entrance = Scanner(System.`in`)

    print("Write the size of array: ")
    val tam = entrance.nextInt()

    /**Java equivalent to Integer sumA[] = new Integer["length"]**/
    val sumA = arrayOfNulls<Int>(tam)

    /**Java equivalent to Integer sumB[] = new Integer["length"]**/
    val sumB = arrayOfNulls<Int>(tam)

    /**Java equivalent to Integer sumC[] = new Integer["length"]**/
    val resu = arrayOfNulls<Int>(tam)

    for (i in sumA.indices) {
        print("Write the values of A: ")
        sumA[i] = entrance.nextInt()

        print("Write the values of B: ")
        sumB[i] = entrance.nextInt()
    }
    for (j in resu.indices) {
        resu[j] = sumA[j]!! + sumB[j]!!
        print(" " + resu[j]!!)
    }
}


