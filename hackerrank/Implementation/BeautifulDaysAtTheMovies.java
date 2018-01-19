import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {

        int theReversedNumber;
        int countDays = 0;
        //i is the starting day and j the last day for instance i = 20, j = 23
        //the loop will go from 20, 21, 22 until 23
        for (int a = i; a <= j; a++){

            theReversedNumber = reverseNumber(a);
            if ((a - theReversedNumber) % k == 0){
                countDays++;
            }
        }
        return countDays;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }

    public static int reverseNumber(int anyNumber) {

        int reverseNumber = 0;
        //While Loop: Logic to find out the reverse number
        while (anyNumber != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + anyNumber % 10;
            anyNumber = anyNumber / 10;
        }
        return reverseNumber;
    }


}// end of class Solution
