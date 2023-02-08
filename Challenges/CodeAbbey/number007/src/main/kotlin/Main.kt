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

    for(index in fahrenheitVec.indices) {
        println("Write the temperatures in *F: ")
        fahrenheitVec[index] = obj.nextDouble()
        celsiusVec[index] = temperatureConversion(fahrenheitVec[index]!!)
    }
}