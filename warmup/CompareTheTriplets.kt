import java.util.*

/*
 * Complete the solve function below.
 */
fun solve(a0: Int, a1: Int, a2: Int, b0: Int, b1: Int, b2: Int): Array<Int> {
    /*
     * Write your code here.
     */
    var arr: Array<Int> = arrayOf(0, 0)

    if (a0 > b0){
        arr[0] += 1
    }
    else if (a0 < b0){
        arr[1] += 1
    }
    if (a1 > b1){
        arr[0] += 1
    }
    else if (a1 < b1){
        arr[1] += 1
    }
    if (a2 > b2){
        arr[0] += 1
    }
    else if (a2 < b2){
        arr[1] += 1
    }

    return arr
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val a0A1A2 = scan.nextLine().split(" ")

    val a0 = a0A1A2[0].trim().toInt()

    val a1 = a0A1A2[1].trim().toInt()

    val a2 = a0A1A2[2].trim().toInt()

    val b0B1B2 = scan.nextLine().split(" ")

    val b0 = b0B1B2[0].trim().toInt()

    val b1 = b0B1B2[1].trim().toInt()

    val b2 = b0B1B2[2].trim().toInt()

    val result = solve(a0, a1, a2, b0, b1, b2)

    println(result.joinToString(" "))
}
