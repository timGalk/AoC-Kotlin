
import java.io.File

fun main() {
    part01()
    part02()
}

fun part01(){
    val input = File("src/main/kotlin/day07part1.txt").readLines()

    println(input)
    val dict = HashMap<Long, String>()
    for (line in input) {
        val arr = line.split(": ")
        dict.put(arr[0].toLong(), arr[1])
    }

    val finalDict = HashMap<Long, List<Int>>()

    for (line in dict) {
        val arr = line.value.split(" ").map { it.toInt() }
        finalDict.put(line.key, arr)
    }

    var result = 0L
    for (line in finalDict){
        if (canFormKey(line.key, line.value)){
            result += line.key
        }
    }


    println(result)








}

fun canFormKey(key: Long, values: List<Int>): Boolean {
    fun check(current: Long, index: Int): Boolean {
        if (index == values.size) {
            return current == key
        }

        val nextValue = values[index].toLong()
        return check(current + nextValue, index + 1) ||
                check(current * nextValue, index + 1)
    }

    return if (values.isNotEmpty()) check(values[0].toLong(), 1) else false
}




fun part02(){

}


