import java.util.Scanner

/**
 * Finds the biggest integer in the array and count times of appearance.
 * @param n number of elements in the array
 * @param ar the array with all elements 
 * @return count of biggest integer in the array
 * */
fun birthdayCakeCandles(n: Int, ar: Array<Int>): Int {

    val biggestNumber: Int? = ar.max()
    var countBiggestNumber: Int = 0

    for (x in 0 until ar.size){

        if (ar[x] == biggestNumber){
            countBiggestNumber++
        }
    }

    return countBiggestNumber
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(n, ar)

    println(result)
}
