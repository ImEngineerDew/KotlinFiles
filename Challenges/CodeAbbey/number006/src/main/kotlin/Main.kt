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

    val div = StringBuffer()
    val round = StringBuffer()

    for (index in vectorA.indices) {
        print("Write the values of vector A: ")
        vectorA[index] = obj.nextInt()
    }
    for (index in vectorB.indices) {
        print("Write the values of vector B: ")
        vectorB[index] = obj.nextInt()
    }
    for (index in vectorDiv.indices) {
        vectorDiv[index] = divisorOperation(vectorA[index]!!, vectorB[index]!!)
        rounded[index] = Math.round(vectorDiv[index]!!)
    }

    /**Convert the arary to String**/
    for (index in rounded.indices) {
        round.append(rounded[index]).append(" ")
    }
    for (index in vectorDiv.indices) {
        div.append(vectorDiv[index]).append(" ")
    }
    println("Result: $div")
    println("Rounded result: $round")
}