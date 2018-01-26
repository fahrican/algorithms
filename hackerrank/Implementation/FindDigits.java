import java.util.Scanner;

public class Solution {

    /*
     * @param 'n' any integer number e.g. 123
     * check how many of the digits can evenly divide 'n'
     * @return number of digits from 'n', which can divide it
     * */
    static int findDigits(int n) {
        // Complete this function
        String allDigits = String.valueOf(n);
        int countDigits = 0;
        int digit;
        
        for (int i = 0; i < allDigits.length(); i++) {

            digit = Character.getNumericValue(allDigits.charAt(i));
            if (digit == 0) {
                continue;
            } else if (n % digit == 0) {
                countDigits++;
            }
        }
        return countDigits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }

}// end of class Solution
