import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    print("Write the size of array: ")
    val sizeArray = input.nextInt()

    val arrayA = arrayOfNulls<Int>(sizeArray)
    val arrayB = arrayOfNulls<Int>(sizeArray)
    val arrayC = arrayOfNulls<Int>(sizeArray)

    for(index in arrayA.indices) {
        print("Write the numbers of arrayA: ")
        arrayA[index]= input.nextInt()
    }
    for(index in arrayB.indices) {
        print("Write the numbers of arrayB: ")
        arrayB[index] = input.nextInt()
    }
    for(index in arrayC.indices)
    {
        print("Write the numbers of arrayC: ")
        arrayC[index] = input.nextInt()
    }
    println("Numbers of array A: "+Arrays.toString(arrayA))
    println("Numbers of array B: "+Arrays.toString(arrayB))
    println("Numbers of array C: "+Arrays.toString(arrayC))


}