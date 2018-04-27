import java.util.Scanner


/**
 * Prints a pyramid of '#'.
 * @param n is equal to height of pyramid and base line. 
 * */
fun staircase(n: Int): Unit {

    for(y in 1..n){

        for (x in n downTo 1){

            if (x > y){
                print(" ")
            }else {
                print("#")
            }
        }
        println()
    }
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
