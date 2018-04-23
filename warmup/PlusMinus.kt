import java.text.DecimalFormat
import java.util.Scanner

/**
 * Iterate through the given array and check each number, if it is positive, negative or zero.
 * Add plus one to one of the three variables, if current number matches condition.
 * After iterating print the values of the three variables.
 * @param arr contains n space-separated integers of positive, negative and zero numbers.
 * */
fun plusMinus(arr: Array<Int>): Unit {

    var fractionOfPositiveNumbers: Double = 0.0
    var fractionOfNegativeNumbers: Double = 0.0
    var fractionOfZeroNumbers: Double = 0.0
    var fivePositionsAfterDecimalPoint = DecimalFormat("#.######")
    for (i in arr) {

        if (i > 0) {
            fractionOfPositiveNumbers++
        } else if (i < 0) {
            fractionOfNegativeNumbers++
        } else {
            fractionOfZeroNumbers++
        }
    }
    println(fivePositionsAfterDecimalPoint.format(fractionOfPositiveNumbers / arr.size))
    println(fivePositionsAfterDecimalPoint.format(fractionOfNegativeNumbers / arr.size))
    println(fivePositionsAfterDecimalPoint.format(fractionOfZeroNumbers / arr.size))
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
