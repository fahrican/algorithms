import java.util.Scanner

/**
 * Cut the first two characters and convert them to Int.
 * Cut the last two characters to see, if format is AM or PM.
 * If given time is 12PM remove PM and return the new String.
 * Otherwise add plus 12 to the first two digits.
 * @param s a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * @return 24 hour time String for instance 19:05:45
 * */
fun timeConversion(s: String): String {

    var timeFormat = StringBuilder(s)
    val checkForAMorPM: String = s.substring(s.length - 2)
    var checkFirstTwoDigits: Int = (s.substring(0, 2)).toInt()

    if (checkForAMorPM.equals("PM")) {

        if (checkFirstTwoDigits == 12) {

            return s.substring(0, s.length - 2)
        } else {
            checkFirstTwoDigits += 12
            timeFormat.replace(0, 2, checkFirstTwoDigits.toString())
        }
    } else {

        if (checkFirstTwoDigits == 12) {
            timeFormat.replace(0, 2, "00")
        }
    }
    timeFormat.replace(s.length - 2, s.length, "")
    return timeFormat.toString()
}

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
