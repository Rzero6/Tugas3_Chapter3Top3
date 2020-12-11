fun main() {

    println("=======================")
    println("Menghitung Luas Persegi")
    println("=======================")

    print("\nMasukkan sisi persegi: ")
    val sisi: Int = readLine()?.toInt()!!
    var luas: Int
    luas = sisi * sisi
    println("\nLuas Persegi adalah $luas")

}