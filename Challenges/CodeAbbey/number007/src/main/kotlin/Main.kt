import java.util.Scanner

fun temperatureConversion(fahrenheit: Double): Double {
    val celsius = (fahrenheit - 32) / 1.8
    return celsius
}

fun main() {
    val obj = Scanner(System.`in`)

    print("Write the size of array: ")
    val size = obj.nextInt()

    val fahrenheitVec = arrayOfNulls<Double>(size)
    val celsiusVec = arrayOfNulls<Double>(size)
    val celsiusRou = arrayOfNulls<Long>(size)

    val fahr = StringBuilder()
    val celR = StringBuilder()

    for (index in fahrenheitVec.indices) {
        print("Write the temperatures in *F: ")
        fahrenheitVec[index] = obj.nextDouble()
        celsiusVec[index] = temperatureConversion(fahrenheitVec[index]!!)
        celsiusRou[index] = Math.round(celsiusVec[index]!!)
    }
    for (index in fahrenheitVec.indices) {
        fahr.append(fahrenheitVec[index]).append(" ")
    }
    for (index in celsiusRou.indices) {
        celR.append(celsiusRou[index]).append(" ")
    }
    println(fahr)
    println(celR)
}