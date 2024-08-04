package org.codelabs.kotlin.basics

fun main(){
    //var rocks: Int = null
    //⇒ error: null can not be a value of a non-null type Int

    var marbles: Int? = null

    var fishFoodTreats = 6
    fishFoodTreats.dec().also { fishFoodTreats = it }
    println(fishFoodTreats)

    var fishFoodTreats1 = 6
    fishFoodTreats1?.dec()!!.also { fishFoodTreats1 = it }
    println(fishFoodTreats1)

    var fishFoodTreats2 = 6
    fishFoodTreats2 = fishFoodTreats2?.dec() ?: 0
    println(fishFoodTreats2)

    val s: String? = null
    val len = s!!.length
    println(len)
}