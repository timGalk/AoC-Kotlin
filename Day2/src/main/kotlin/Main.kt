fun main(){
    // Part 1
    val first = Task1()
    val reader = Reader()
    val nestedArray = reader.readFileToNestedArray("src/main/resources/input.txt")
    var sumOfTrueVals = 0

    for (i in nestedArray) {
        if (first.isStringSafe(i)) {
            sumOfTrueVals++
        }
    }
    println(sumOfTrueVals)

    // Part 2
    val second = Task2()
    var truthCounter = 0
    val arraySecPart = reader.readFileToNestedArray("src/main/resources/input p2.txt")
    for (i in arraySecPart){
        if(second.isStringSafe(i)){
            truthCounter++
        }

    }
    println(truthCounter)
}