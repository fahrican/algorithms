import java.util.*

fun aVeryBigSum(n: Int, ar: Array<Long>): Long {

    var sum: Long = 0
    for (x in ar) {
        sum += x
    }
    return sum
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()

    val result = aVeryBigSum(n, ar)

    println(result)
}
