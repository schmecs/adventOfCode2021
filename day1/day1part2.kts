import java.io.File

val inputs = mutableListOf<Int>()

File("/Users/rblum/Documents/code/adventOfCode/day1/input1.txt").useLines {
    inputs.addAll(it.map(String::toInt))
}.apply {
    if (inputs.size < 3) throw IllegalArgumentException("Data not applicable to problem")

    var numIncreases = 0
    for (i in 2 until inputs.size - 1) {
        val previous = inputs[i - 2]
        val next = inputs[i + 1]
        if (next > previous) {
            numIncreases++
        }
    }

    println(numIncreases)
}

