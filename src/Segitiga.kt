fun main() {
    println("========================")
    println("Menghitung Luas Segitiga")
    println("========================")


    println("\nMasukkan alas: ")
    val alas: Double = readLine()?.toDouble()!!

    println("\nMasukkan tinggi: ")
    val tinggi: Double = readLine()?.toDouble()!!

    var luas: Double


    luas = alas * tinggi / 2
    println("\nLuas Segitiga adalah $luas")

}