import java.util.Scanner;

public class ServiceLane {

    /*
    * @param width[] all widths, which a vehicle can pass e.g. |---| or |-|
    * @param testCases[][] contains all start and end indexes to test, e.g. from 0 to 3 or 4 to 6
    * @param numberOfTestCases number of test cases
    *
    * @return solution array, which contains the smallest integers in the start and end indexes
    * */
    private static int[] serviceLane(int[] width, int[][] testCases, int numberOfTestCases) {
        // Complete this function
        int[] lanes = new int[numberOfTestCases];

        for (int i = 0; i < testCases.length; i++) {
            
            //1. get the start and end index
            int startIndex = testCases[i][0];
            int endIndex = testCases[i][1];
            int arrayElement = Integer.MAX_VALUE;
            //2. look, which number in the indexes is the smallest
            for (int j = startIndex; j <= endIndex; j++) {

                if (width[j] < arrayElement) {
                    arrayElement = width[j];
                }
            }
            //3. save it in the solution array
            lanes[i] = arrayElement;
        }
        return lanes;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for (int width_i = 0; width_i < n; width_i++) {
            width[width_i] = in.nextInt();
        }
        int[][] cases = new int[t][2];
        for (int cases_i = 0; cases_i < t; cases_i++) {
            for (int cases_j = 0; cases_j < 2; cases_j++) {
                cases[cases_i][cases_j] = in.nextInt();
            }
        }
        int[] result = serviceLane(width, cases, t);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}// end of class Solution
