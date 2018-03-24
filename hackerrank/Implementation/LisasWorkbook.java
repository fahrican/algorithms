import java.util.Scanner;

public class LisasWorkbook {

    /*check number of allowed problems on a page
     *if number is bigger and it is divisible by the number of allowed problems
     *and number isn't last number of iteration, because number of pages increases
     *after each iteration of a nested loop
     */
    private static int workbook(int n, int k, int[] arr) {
        // Complete this function
        int specialProblems = 0;
        int numberOfPages = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= arr[i]; j++) {

                if (j == numberOfPages) {
                    specialProblems++;
                }
                if (j >= k && j % k == 0 && j != arr[i]) {
                    numberOfPages++;
                }
            }
            //the next iteration of the array starts, so a new page is needed
            numberOfPages++;
        }
        return specialProblems;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
