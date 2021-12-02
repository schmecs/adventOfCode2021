import java.io.File

val inputs = mutableListOf<String>()

val fileContents = File("/Users/rblum/Documents/code/adventOfCode/day2/input2.txt").readLines()
inputs.addAll(fileContents)

var forwardDistance = 0
var depth = 0
var aim = 0

inputs.forEach {
    val contents = it.split(" ")
    val amount = contents[1].toInt()
    when (contents[0]) {
        "forward" -> {
            forwardDistance += amount
            depth += (amount * aim)
        }
        "down" -> aim += amount
        "up" -> aim -= amount
    }
}

println(forwardDistance * depth)