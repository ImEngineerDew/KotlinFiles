import java.util.Scanner;

fun main() {

    val entrance = Scanner(System.`in`)

    print("Write the size of array: ")
    val length = entrance.nextInt()

    /**Java equivalent to Integer sumA[] = new Integer["length"]**/
    val sumA = arrayOfNulls<Int>(length)

    /**Java equivalent to Integer sumB[] = new Integer["length"]**/
    val sumB = arrayOfNulls<Int>(length)

    /**Java equivalent to Integer sumC[] = new Integer["length"]**/
    val sumC = arrayOfNulls<Int>(length)

    for (i in sumA.indices) {

        sumA[i] = entrance.nextInt()
        sumB[i] = entrance.nextInt()
    }
}