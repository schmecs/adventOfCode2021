import java.io.File

val inputs = mutableListOf<String>()

val fileContents = File("/Users/rblum/Documents/code/adventOfCode/day2/input2.txt").readLines()
inputs.addAll(fileContents)

var forwardDistance = 0
var depth = 0

inputs.forEach {
    val contents = it.split(" ")
    val amount = contents[1].toInt()
    when (contents[0]) {
        "forward" -> forwardDistance += amount
        "down" -> depth += amount
        "up" -> depth -= amount
    }
}

println(forwardDistance * depth)

