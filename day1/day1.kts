import java.io.File

val inputs = mutableListOf<Int>()

try {
    File("/Users/rblum/Documents/code/adventOfCode/day1/input1.txt").useLines {
        inputs.addAll(it.map(String::toInt))
    }
    println(inputs)
} catch (e: Exception) {
    println(e)
}

var numIncreases = 0
var currentValue = -1

inputs.forEach {
    if (currentValue < 0) currentValue = it
    if (it > currentValue) {
        numIncreases++
    }
    currentValue = it
}

println(numIncreases)