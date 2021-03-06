package day1

import util.readFileToInts

fun main () {
    val vals = readFileToInts("src/day1/resources/Day1.txt")
    for (x in vals) for (y in vals) if (x + y == 2020) println("Part one: ${x*y}")
    for (x in vals) for (y in vals) for (z in vals) if (x + y + z == 2020) println("Part two: ${x*y*z}")
}