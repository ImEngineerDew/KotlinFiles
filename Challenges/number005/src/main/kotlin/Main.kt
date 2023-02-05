import java.util.*

fun main() {

    val input = Scanner(System.`in`)

    print("Please write the size of your array: ")
    val sizeArray = input.nextInt()

    val arrayA = arrayOfNulls<Int>(sizeArray)
    val arrayB = arrayOfNulls<Int>(sizeArray)
    val arrayC = arrayOfNulls<Int>(sizeArray)
    val arrayRes = arrayOfNulls<Int>(sizeArray)

    var index = 0

    for (index in arrayA.indices) {
        print("Write the numbers of array A: ")
        arrayA[index] = input.nextInt()
    }
    println(" ")
    for (index in arrayB.indices) {
        print("Write the numbers of array B: ")
        arrayB[index] = input.nextInt()
    }
    println(" ")
    for (index in arrayC.indices) {
        print("Write the numbers of array C: ")
        arrayC[index] = input.nextInt()

        if (arrayA[index]!! < arrayB[index]!!) {
            if (arrayA[index]!! < arrayC[index]!!) {
                arrayRes[index] = arrayA[index]
            } else {
                arrayRes[index] = arrayC[index]
            }
        } else {
            if (arrayB[index]!! < arrayC[index]!!) {
                arrayRes[index] = arrayB[index]
            } else {
                arrayRes[index] = arrayC[index]
            }
        }
    }
    println(" ")
    println("Values of A: " + Arrays.toString(arrayA))
    println("Values of B: " + Arrays.toString(arrayB))
    println("Values of C: " + Arrays.toString(arrayC))
    println("")
    println("Numbers compared: " + Arrays.toString(arrayRes))
}