fun main() {

    println("===============================")
    println("Menghitung Luas Persegi Panjang")
    println("===============================")

    print("\nMasukkan panjang persegi: ")
    val panjang: Int = readLine()?.toInt()!!
    print("Masukkan lebar persegi: ")
    val lebar: Int = readLine()?.toInt()!!
    var luas: Int
    luas = panjang * lebar
    println("\nLuas Persegi Panjang adalah $luas")

}