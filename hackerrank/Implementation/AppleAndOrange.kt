import java.util.Scanner

/**
 * First create a variable for amount of fruits.
 * Second iterate through the arrays.
 * Check if position of tree plus current element is in range
 * of starting and end point of house.
 * */
private fun countNumberOfFruits(fruits: Array<Int>, positionOfTree: Int, startingPointOfHouse: Int, endPointOfHouse: Int): Int {

    var amountOfFruits = 0
    for (i in 0 until fruits.size) {

        if ((positionOfTree + fruits[i]) >= startingPointOfHouse && (positionOfTree + fruits[i]) <= endPointOfHouse) {
            amountOfFruits++
        }
    }
    return amountOfFruits
}

fun countApplesAndOranges(startingPointOfHouse: Int, endPointOfHouse: Int, positionAppleTree: Int, positionOrangeTree: Int, apples: Array<Int>, oranges: Array<Int>) {

    val amountOfApples: Int = countNumberOfFruits(apples, positionAppleTree, startingPointOfHouse, endPointOfHouse)
    val amountOfOranges: Int = countNumberOfFruits(oranges, positionOrangeTree, startingPointOfHouse, endPointOfHouse)

    println(amountOfApples)
    println(amountOfOranges)
}

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val s: Int = scanner.nextInt()
    val t: Int = scanner.nextInt()
    val positionAppleTree: Int = scanner.nextInt()
    val positionOrangeTree: Int = scanner.nextInt()
    val numberOfApples: Int = scanner.nextInt()
    val numberOfOranges: Int = scanner.nextInt()

    val apples = Array(numberOfApples, {0})
    for (i in 0 until numberOfApples){

        apples[i] = scanner.nextInt()
    }

    val oranges = Array(numberOfOranges, {0})
    for (i in 0 until numberOfOranges){

        oranges[i] = scanner.nextInt()
    }

    countApplesAndOranges(s, t, positionAppleTree, positionOrangeTree, apples, oranges)
}
