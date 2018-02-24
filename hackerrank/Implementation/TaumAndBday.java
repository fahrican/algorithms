import java.util.Scanner;

public class TaumAndBday {

    /*
    * @param b number of black gifts to buy
    * @param w number of white gifts to buy
    * @param x price for each black gift
    * @param y price for each white gift
    * @param z cost of converting each black gift into white gift or vice versa
    *
    * calculate what is cheaper to buy direct black, or white gift or to convert them
    *
    * @return sum of complete price for black gifts and white gifts 
    * */
    private static long taumBday(long b, long w, long x, long y, long z) {
        // Complete this function

        //Calculate white->black and choose max between it and black
        long minBlackPrice = Math.min(x, y + z);

        //Calculate black->white and choose max between it and white
        long minWhitePrice = Math.min(y, x + z);

        return (b * minBlackPrice + w * minWhitePrice);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            long result = taumBday(b, w, x, y, z);
            System.out.println(result);
        }
        in.close();
    }

}// end of class Solution
