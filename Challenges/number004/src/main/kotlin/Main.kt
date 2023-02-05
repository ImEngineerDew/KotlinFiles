import java.util.Scanner

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



}