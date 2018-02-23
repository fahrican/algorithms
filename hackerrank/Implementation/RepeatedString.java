import java.util.Scanner;

public class RepeatedString {

    /*
    * @param any String for instance 'aba'
    * @param long length of characters the String should include
    *
    * for instance 10 the String would be 'abaabaabaa'
    * the aim is to count the 'a' in the String
    * first iterate with an loop through the original String to count the 'a'
    * than divide the @param long through the length of the @param String
    * to see how many times it would fit in the length the String should have
    * multiply the count of the 'a' with the divison
    * than use the modolo to get the remainder from the division before
    * iterate through the original String again and for number of times take the remainder
    * keep on counting the 'a'
    * 
    * @return count of 'a'
    * */
    private static long repeatedString(String s, long n) {
        // Complete this function
        long countA = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a'){
                countA++;
            }
        }

        long division = n / s.length();
        long remainder = n % s.length();
        countA *= division;
        for (int j = 0; j < remainder; j++) {

            if (s.charAt(j) == 'a'){
                countA++;
            }
        }
        return countA;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
