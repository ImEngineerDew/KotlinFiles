import java.util.Scanner

fun writeArray(sumArray: Array<Int?>, index:Int, entrance:Scanner)
{
    if(index.equals(sumArray.indices))
    {
        return
    }
        print("Write the elements of the array: ")
        sumArray[index] = entrance.nextInt()
        writeArray(sumArray,index+1,entrance)
}

fun readArray(array:Array<Int?>,index:Int)
{
    if(index.equals(array.indices-1))
    {
        return
    }
    else
    {
        readArray(array,index+1)
    }
}
fun main() {

    val entrance = Scanner(System.`in`)

    print("Write the size of array: ")
    val tam = entrance.nextInt()

    /**Java equivalent to Integer sumA[] = new Integer["length"]**/
    val sumA = arrayOfNulls<Int>(tam)

    /**Java equivalent to Integer sumB[] = new Integer["length"]**/
    val sumB = arrayOfNulls<Int>(tam)

    readArray(sumA,0)
    readArray(sumB,0)

    writeArray(sumA,0,entrance)
    writeArray(sumB,0, entrance)


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


