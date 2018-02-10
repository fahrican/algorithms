import java.util.Scanner;

public class MinimumDistances {

    /*
     *@param int[] containing duplicate elements or no duplicate elements
     *find equal elements, which has minimum index distance to each other
     *@return -1 if there are no equal elements, otherwise minimum difference from one index to another
     */
    private static int minimumDistances(int[] a) {
        // Complete this function
        int minimumDifference = a.length;

        for (int i = 0; i < a.length; i++) {

            int tempElement = a[i];
            int tempDifference;
            for (int j = (a.length-1); j > i; j--) {

                if (tempElement == a[j]){
                    tempDifference = j - i;

                    if (tempDifference < minimumDifference) {
                        minimumDifference = tempDifference;
                    }
                }
            }
        }

        return (minimumDifference == a.length) ? -1 : minimumDifference;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
