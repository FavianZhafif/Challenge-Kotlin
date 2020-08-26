import java.util.Scanner
import kotlin.math.ceil

fun main(){
    val inputData = Scanner(System.`in`)
    print("Nama     :")
    val nama = inputData.nextLine()
    print("Kelas    :")
    val kelas = inputData.nextLine()
    print("No.Absen :")
    val absen = inputData.nextInt()
    val tabung = Tabung()
    val kerucut = Kerucut()

    println("1. Volume Kerucut")
    println("2. Volume Tabung")
    print("Pilihan Anda : ")
    when {
        inputData.nextInt() == 1 -> {
            print("memiliki tinggi    : ")
            kerucut.tinggi = inputData.nextFloat()
            print("memiliki jari-jari : ")
            kerucut.jariJari = inputData.nextFloat()
            println("maka,")
            println("Diketahui : \n Jari-jari ${kerucut.jariJari} \n Tinggi ${kerucut.tinggi}")

            val vKerucut = volumeKerucut(kerucut.jariJari!!, kerucut.tinggi!!)
            val volumeBulatkan = ceil(vKerucut)
            println("Jawab     : \n Rumus Kerucut Adalah ( (1/3) * (22/7) * r * r * tinggi )\n Jadi Volume Kerucutnya            :"
                    + String.format("%.2f", vKerucut )
                    + "\n Volume Kerucut Setelah Dibulatkan : $volumeBulatkan")

        }
        inputData.nextInt() == 2 -> {
            print("memiliki tinggi    : ")
            tabung.tinggi = inputData.nextFloat()
            print("memiliki jari-jari : ")
            tabung.jariJari = inputData.nextFloat()
            println("maka,")
            println("Diketahui : \n Jari-jari ${tabung.jariJari} \n Tinggi ${tabung.tinggi}")

            val vTabung = volumeTabung(tabung.jariJari!!, tabung.tinggi!!)
            val volumeBulatkan = ceil(vTabung)
            println("Jawab     : \n Rumus Tabung Adalah ( (22/7) * r * r * tinggi )\n Jadi Volume Tabungnya               ae:"
                    + String.format("%.2f", vTabung )
                    + "\n Dan Volume Tabung Setelah Dibulatkan :$volumeBulatkan")


        }
        else -> {
            println("Mohon Maaf Yang Anda Pilih Tidak Sesuai!!")
        }
    }

}

fun volumeKerucut(r : Float, t : Float) : Double{
    return (Math.PI * r * r) * t / 3
}
fun volumeTabung(r : Float, t : Float) : Double {
    return (Math.PI * r * r) * t
}

