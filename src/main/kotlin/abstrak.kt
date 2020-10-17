abstract class Personal(nama: String) {
    init {
        println("Nama Saya Adalah $nama.")
    }

    fun tampilkanSSN(ssn: Int){
        println("SSN saya adalah $ssn.")
    }

    abstract fun tampilkan(keterangan: String)
}

class Pengajar(nama: String): Personal(nama) {
    override fun tampilkan(keterangan: String){
        println(keterangan)
    }
}

fun main(){
    val jek = Pengajar("Zain")
    jek.tampilkan("Saya Seorang Pengajar Matematika")
    jek.tampilkanSSN(23124)
}