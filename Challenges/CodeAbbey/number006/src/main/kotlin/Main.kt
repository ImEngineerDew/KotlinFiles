import java.util.Arrays
import java.util.Scanner

fun divisorOperation(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}

fun main() {
    val obj = Scanner(System.`in`)

    print("Write the size of array: ")
    val size = obj.nextInt()

    val vectorA = arrayOfNulls<Int>(size)
    val vectorB = arrayOfNulls<Int>(size)
    val vectorDiv = arrayOfNulls<Double>(size)
    val rounded = arrayOfNulls<Long>(size)

    for (index in vectorA.indices) {
        print("Write the values of vector A: ")
        vectorA[index] = obj.nextInt()
    }
    for (index in vectorB.indices) {
        print("Write the values of vector B: ")
        vectorB[index] = obj.nextInt()
    }
    for(index in vectorDiv.indices) {
        vectorDiv[index] = divisorOperation(vectorA[index]!!,vectorB[index]!!)
        rounded[index] = Math.round(vectorDiv[index]!!)
    }
    println("Result: "+ Arrays.toString(vectorDiv))
    println("Rounded result :"+ Arrays.toString(rounded))
}