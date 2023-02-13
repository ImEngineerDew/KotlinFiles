import java.util.Scanner

fun main(args: Array<String>) {

    val obj = Scanner(System.`in`)
    val valueArr = obj.nextInt()

    val sideA = arrayOfNulls<Int>(valueArr)
    val sideB = arrayOfNulls<Int>(valueArr)
    val sideC = arrayOfNulls<Int>(valueArr)

    val triangle = arrayOfNulls<Int>(valueArr)

    for (index in sideA.indices) {
        sideA[index] = obj.nextInt()
        sideB[index] = obj.nextInt()
        sideC[index] = obj.nextInt()
    }
    for (index in triangle.indices) {
        if ((sideA[index]!! + sideB[index]!!) > sideC[index]!!) {
            if ((sideA[index]!! + sideC[index]!!) > sideB[index]!!) {
                if ((sideC[index]!! + sideB[index]!!) > sideA[index]!!) {
                    print(1)
                } else {
                    print(0)
                }
            } else {
                print(0)
            }
        } else {
            print(0)
        }
    }
}