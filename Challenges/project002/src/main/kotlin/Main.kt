import java.util.Scanner

fun main() {

    val obj = Scanner(System.`in`)

    print("Write the length of Array: ")
    val length = obj.nextInt()

    val values = arrayOfNulls<Int>(length)
    var result = 0

    for (i in values.indices) {
        print("Write the numbers to add: ")
        values[i] = obj.nextInt()
        //result += values[i]!!
        result = result.plus(values[i]!!) /**An operator plus has been assigned**/
    }
    print("Result of the sum of this array: $result")
}