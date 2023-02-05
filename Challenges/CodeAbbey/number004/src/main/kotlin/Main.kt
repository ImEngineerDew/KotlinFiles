import java.util.*

fun main() {

    val input = Scanner(System.`in`)

    print("Write the size of array: ")
    val sizeArray = input.nextInt()

    println(" ")
    val arrayA = arrayOfNulls<Int>(sizeArray)
    val arrayB = arrayOfNulls<Int>(sizeArray)
    val arrayComp = arrayOfNulls<Int>(sizeArray)

    var index = 0

    for (index in arrayA.indices) {
        print("Write the numbers of arrayA: ")
        arrayA[index] = input.nextInt()
    }
    println(" ")
    for (index in arrayB.indices) {
        print("Write the numbers of arrayB: ")
        arrayB[index] = input.nextInt()

        if (arrayA[index]!! < arrayB[index]!!) {
            arrayComp[index] = arrayA[index]!!
        } else if (arrayA[index]!! > arrayB[index]!!) {
            arrayComp[index] = arrayB[index]!!
        }
    }
    println(" ")
    println("Numbers of array A: " + Arrays.toString(arrayA))
    println("Numbers of array B: " + Arrays.toString(arrayB))
    println("Numbers of compared arrays: " + Arrays.toString(arrayComp))
}