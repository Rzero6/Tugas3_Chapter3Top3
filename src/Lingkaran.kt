import kotlin.math.*

fun main() {
    println("=========================")
    println("Menghitung Luas Lingkaran")
    println("=========================")


    print("\nMasukkan Diameter Lingkaran: ")
    val diameter: Double = readLine()?.toDouble()!!

    var luas: Double

    var jari : Double

    val pi = 3.14

    jari = diameter/2

    luas = pi*jari*jari
    println("\nLuas Segitiga adalah $luas")

}