import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    /*
    * Factorials of n > 20 can't be stored even in a 64bit long variable.
    * BigIntegers must be used for such calculations.
    * The factorial of 20 is 2432902008176640000
    * */
    static void extraLongFactorials(int n) {
        // Complete this function
        BigInteger factorialNumber = new BigInteger("1");
        while (n > 1) {
            //multiply(BigInteger val) = Returns a BigInteger whose value is (this * val).
            factorialNumber = factorialNumber.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(factorialNumber);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }

}// end of class Solution
