package com.example.lekcjapierwsza


fun funckja1() {
    println("Podaj swoj napis:")
    val napis = readLine() ?: ""

    println("Twoj napis ma ${napis.length} znakow")
}

fun funckja2() {
    println("podaj nazwe owoca: ")
    val owoc = readLine() ?: ""

    when (owoc) {
        "pomidor" -> println("pomidor")
        "truskawka" -> println("truskawka")
        else -> println("to nie jest ani truskawka ani pomidor")
    }
}
