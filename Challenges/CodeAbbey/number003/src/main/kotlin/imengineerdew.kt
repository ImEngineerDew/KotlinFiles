import java.util.Scanner

object imengineerdew {

    val `object` = Scanner(System.`in`)

    @JvmStatic
    fun main(args: Array<String>) {

        val pos = 0
        val size = `object`.nextInt()

        /** Define the array and its size  */
        val vectorA = arrayOfNulls<Int>(size)
        val vectorB = arrayOfNulls<Int>(size)

        /** read the arrays with Scanner object  */
        readArray(vectorA, vectorB, pos)

        /** Print the sums of both arrays  */
        resultSum(vectorA, vectorB, pos)
    }

    fun showArray(vectorA: Array<Int>, vectorB: Array<Int>, i: Int) {
        if (i == vectorA.size - 1 || i == vectorB.size - 1) {
            print(vectorA[i].toString() + " ")
            print(vectorB[i].toString() + " ")
        } else {
            print(vectorA[i].toString() + " ")
            print(vectorB[i].toString() + " ")
            showArray(vectorA, vectorB, i + 1)
        }
    }

    fun resultSum(vectorA: Array<Int?>, vectorB: Array<Int?>, i: Int) {
        if (i == vectorA.size || i == vectorB.size) {
            return
        }
        val res = vectorA[i]!! + vectorB[i]!!
        print("$res ")
        resultSum(vectorA, vectorB, i + 1)
    }

    fun readArray(vectorA: Array<Int?>, vectorB: Array<Int?>, i: Int) {
        if (i == vectorA.size || i == vectorB.size) {
            return
        }
        vectorA[i] = `object`.nextInt()
        vectorB[i] = `object`.nextInt()
        readArray(vectorA, vectorB, i + 1)
    }
}