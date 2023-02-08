import java.util.Scanner

fun divisorOperation(a: Int, b: Int): Double  {
    return a.toDouble()/b.toDouble()
}

fun main() {

    val obj = Scanner(System.`in`)

    print("Write the size of array: ")
    val size = obj.nextInt()

    val vectorA = arrayOfNulls<Int>(size)
    val vectorB = arrayOfNulls<Int>(size)
    val vectorC = arrayOfNulls<Int>(size)

    for(index in vectorA.indices) {
        print("Write the values of vector A: ")
        vectorA[index] = obj.nextInt()
    }
    for(index in vectorB.indices) {
        print("Write the values of vector B: ")
        vectorB[index] = obj.nextInt()
    }

}