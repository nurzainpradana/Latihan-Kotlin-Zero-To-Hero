fun main(){
    //Pengaksesan anggota dari Nested Class
    println(Outer.Nested().b)

    //Pembuatan Objek dari Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())


    //println(Outer2.Nested().callMe())
}
/*
Nested Class
mengizinkan kita untuk mendefinisikan class di dalam class lainnya
dikarenakan kotlin class merupakan kelas yang lain, maka kita dapat menggunakan notasi untuk mengaksesnya nested class dan anggotanya
*/
class Outer {
    val a = "Di Luar Nested Class"
    class Nested {
        val b = "Di Dalam Nested Class"
        fun callMe() = "Function akan dipanggil di dalam nested class."
    }
}
/*
Inner Class
inner class tidak dapat mengakses diluar class nested
mendeklarasikan class di dalam class lain, secara default disebut inner class
 */

class Outer2{
    val foo = "Diluar dari nested Class"

    class Nested {
        //ERORR! tidak dapat mengakses anggota dari luar class
        //fun callMe2() = foo
    }

    // gunakan kata inner untuk membuat inner class, akan membawa refernsi kedalam sebuah class, dan dapat mengakses anggota dari luar class
    inner class Inner(){
        fun callMe3() = foo
    }
}

