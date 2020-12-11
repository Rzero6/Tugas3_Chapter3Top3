fun main() {
    println("========================")
    println("Menghitung Luas Segitiga")
    println("========================")


    print("\nMasukkan alas: ")
    val alas: Double = readLine()?.toDouble()!!

    print("Masukkan tinggi: ")
    val tinggi: Double = readLine()?.toDouble()!!

    var luas: Double


    luas = alas * tinggi / 2
    println("\nLuas Segitiga adalah $luas")

}