package org.codelabs.kotlin.basics

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1

fun main(){
    var dirtyLevel = 20
    //val waterFilter = { dirty : Int -> dirty / 2}
    //println(waterFilter(dirtyLevel))

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel1 = 19;
    dirtyLevel1 = updateDirty(dirtyLevel1) { dirtyLevel1 -> dirtyLevel1 + 23}
    println(dirtyLevel1)
}