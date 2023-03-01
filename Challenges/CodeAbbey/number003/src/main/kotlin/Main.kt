import java.util.Scanner

object Main {
    fun writeArray(sumArray: Array<Int?>, index: Int, `entrance`: Scanner) {
        if (index == sumArray.size) {
            return
        }
        print("Write the elements of the array: ")
        sumArray[index] = `entrance`.nextInt()
        writeArray(sumArray, index + 1, `entrance`)
    }

    fun readArray(array: Array<Int?>, index: Int) {
        if (index == array.size - 1) {

        } else {
            readArray(array, index + 1)
        }
    }

    fun resultSum(vectorA: Array<Int?>, vectorB: Array<Int?>, index: Int) {
        if (index == vectorA.size || index ==vectorB.size ) {
            return
        }
        val res = vectorA[index]!! + vectorB[index]!!
        print("$res ")
        resultSum(vectorA, vectorB, index + 1)
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val `entrance` = Scanner(System.`in`)

        print("Write the size of array: ")
        val tam = `entrance`.nextInt()

        val index = 0

        /**Java equivalent to Integer sumA[] = new Integer["length"]**/
        val sumA = arrayOfNulls<Int>(tam)

        /**Java equivalent to Integer sumB[] = new Integer["length"]**/
        val sumB = arrayOfNulls<Int>(sumA.size)

        readArray(sumA, 0)
        readArray(sumB, 0)

        writeArray(sumA, 0, `entrance`)
        writeArray(sumB, 0, `entrance`)

        resultSum(sumA,sumB,index)

        /*
        /**Java equivalent to Integer sumA[] = new Integer["length"]**/
        val sumA = arrayOfNulls<Int>(tam)

        /**Java equivalent to Integer sumB[] = new Integer["length"]**/
        val sumB = arrayOfNulls<Int>(tam)

        /**Java equivalent to Integer sumC[] = new Integer["length"]**/
        val resu = arrayOfNulls<Int>(tam)

        for (i in sumA.indices) {
            print("Write the values of A: ")
            sumA[i] = entrance.nextInt()

            print("Write the values of B: ")
            sumB[i] = entrance.nextInt()
        }
        for (j in resu.indices) {
            resu[j] = sumA[j]!!.plus(sumB[j]!!)
            print(" " + resu[j]!!)
        }
         */
    }
}


