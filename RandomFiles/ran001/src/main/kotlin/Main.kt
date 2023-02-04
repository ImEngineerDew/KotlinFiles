import java.util.*

fun main() {

    /**This line code is the input data**/
    val entrance = Scanner(System.`in`)

    print("Define the size of you array: ")
    val size = entrance.nextInt()

    val numArray = arrayOfNulls<Int>(size)

    for(index in numArray.indices) {
        print("Write the numbers: ")
        val numbers = entrance.nextInt()

        numArray[index] = numbers
    }
    print(Arrays.toString(numArray))
}