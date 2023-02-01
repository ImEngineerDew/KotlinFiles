import java.util.*
import java.lang.*

fun main(args: Array<String>) {

    val obj = Scanner (System.`in`)

    print("Write the length of Array: ")
    var length = obj.nextInt()

    var values = arrayOfNulls<Int>(length)
    var result = 0

    for (i in values.indices)
    {
        print("Write the numbers to add: ")
        values[i] = obj.nextInt()
        result+= values[i]!!
    }
    print(result)


}