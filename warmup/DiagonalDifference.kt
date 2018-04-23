import java.util.Scanner

/**
 * given is a n * n matrix, first is to sum the values of the left diagonal
 * than from the right diagonal, at the end calculate the absolute difference from both diagonals
 * @param a contains a n * n matrix
*/
fun diagonalDifference(a: Array<Array<Int>>): Int {

    var firstDiagonal: Int = 0
    var secondDiagonal: Int = 0
    var diagonalElements = a.size - 1
    for (row in a) {

        firstDiagonal += row[diagonalElements]
        if (diagonalElements == 0) break else diagonalElements--
    }

    for (row in a) {

        secondDiagonal += row[diagonalElements]
        if (diagonalElements == (a.size - 1)) break else diagonalElements++
    }

    return Math.abs(firstDiagonal - secondDiagonal)
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (aRowItr in 0 until n) {
        a[aRowItr] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = diagonalDifference(a)

    println(result)
}
