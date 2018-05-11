import java.util.Scanner

/**
 * If element is less than 38 don't modify it.
 * Add 1 or 2 to element to see, if it is a multiple of five.
 * @param grades grades for instance {73, 67, 38, 33}
 * @return Array<Int> with modified or unmodified elements
 * */
fun gradingStudents(grades: Array<Int>): Array<Int> {

    for (i in 0 until grades.size){

        if (grades[i] < 38 ){
            continue
        }
        else if ((grades[i]+1) % 5 == 0){
            grades[i]+=1
        }
        else if ((grades[i]+2) % 5 == 0){
            grades[i]+=2
        }
    }
    return grades
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
