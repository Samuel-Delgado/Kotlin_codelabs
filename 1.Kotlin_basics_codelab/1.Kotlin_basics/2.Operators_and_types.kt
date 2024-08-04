package org.codelabs.kotlin.basics

fun main() {
    val i = 6

    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

    /*val i1: Int = b2
    ⇒ error: type mismatch: inferred type is Byte but Int was expected

    val i2: String = b2
    ⇒ error: type mismatch: inferred type is Byte but String was expected

    val i3: Double = b2
    ⇒ error: type mismatch: inferred type is Byte but Double was expected*/

    val i4: Int = b2.toInt() // OK!
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("One Million: $oneMillion")
    println("Social Security Number: $socialSecurityNumber")
    println("Hex Bytes: ${hexBytes.toUInt().toString(16)}")
    println("Bytes: ${bytes.toUInt().toString(2)}")

   /* var fish = 1
    fish = 2
    val aquarium = 1
    aquarium = 2 */

    val numberOfFish = 5
    val numberOfPlants = 12
    print("I have ${numberOfFish + numberOfPlants} fish and plants")

}


