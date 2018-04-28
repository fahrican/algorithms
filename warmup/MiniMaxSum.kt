import java.util.Scanner

/**
 * print difference from sum of array and minimum number and
 * difference from sum of array and maximum number
 * @param arr find minimum and maximum Long value in array
 * subtract both values from sum and print them 
 * */
fun miniMaxSum(arr: Array<Long>): Unit {

    val minimumNumber: Long = arr.min()!!
    val maximumNumber: Long = arr.max()!!
    val sumOfArray: Long = arr.sum()
    println("${sumOfArray - maximumNumber} ${sumOfArray - minimumNumber}")
}

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    miniMaxSum(arr)
}
