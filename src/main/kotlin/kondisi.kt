fun main(){
    val number = -10

    // IF Expression
    /*
    Pernyataan yang menentukan apakah kondisi tersebut salah atau benar
     */
    if (number > 0){ //Jika number diatas 0
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    /*
    IF Expression
    1. If dengan multiExpression
    2. Ekspresi if ... else ... if kotlin
    3. Ekspresi Nested If kotlin
     */

    /*
    IF dengan Multiple Expression
    jika cabang if mengandung banyak ekspresi, ekspressi terakhir dikembalikan sebagai nilai blok
     */
    val a = -9
    val b = -11
    val max = if (a > b){
        println("$a lebih besar dari $b")
        println("val max memiliki value $a")
        a
    } else {
        println("$b lebih besar dari $a")
        println("val max memiliki value $b")
        b
    }

    /*
    Ekspresi If ... Else ... If
    kita dapat mengeluarkan blok diantara banyak blok pada kotlin menggunakan susunan if else if
     */
    val number2 = 0
    val result = if (number2 > 0)
        "Positive Number"
    else if (number2 < 0 )
        "Negative Number"
    else
        "Zero"
    println("Number result is $result")

    /*
    Ekspresi Nested If Kotlin
    if ekspression dapat berada di blok lainnya
    jika ekspression di deklarasikan sebagai nested
     */

    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max1 = if (n1 > n2){
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("max = $max1")
}