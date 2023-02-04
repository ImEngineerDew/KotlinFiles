import java.util.*

fun main() {

    /**This line code is the input data**/
    val entrance = Scanner(System.`in`)

    print("Define the size of you array: ")
    val size = entrance.nextInt()

    val numArray = arrayOfNulls<Int>(size)
    var numbers = 0

    for(index in numArray.indices) {
        print("Write the numbers: ")
        numArray[index] = entrance.nextInt()
        numbers = numbers.plus(numArray[index]!!)
    }
    print("Values of array: "+ numArray.contentToString())
    println("Result of the sum of this array: $numbers")
}