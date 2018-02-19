import java.util.Scanner;
import java.util.Arrays;


public class CutTheSticks {

    /*
     * @param int[] consists of positive elements, no elements is bigger than 1000
     * each iteration all elements greater 0 gets subtracted by the smallest element in the array
     * you save how many elements are affected
     * if the smallest element is equal to 0, you take the current smallest element to subtract
     * @return int[] with contains numbers of all affected elements in each iteration
     * */
    private static int[] cutTheSticks(int[] arr) {
        // Complete this function
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            tempArray[i] = countElementsBiggerZero(arr);
            int smallestElement = getSmallestInt(arr);
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > 0) {
                    arr[j] -= smallestElement;
                }
            }
        }
        int lengthOfArray = countElementsBiggerZero(tempArray);
        int[] resultArray = new int[lengthOfArray];
        for (int i = 0; i < tempArray.length; i++) {

            if (tempArray[i] == 0) {
                break;
            }
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    private static int getSmallestInt(int[] theArray) {

        int smallestElement = 1000;
        int temp;
        Arrays.sort(theArray);
        for (int i = 0; i < theArray.length; i++) {

            if (theArray[i] > 0) {
                temp = theArray[i];
                if (smallestElement > temp) {
                    smallestElement = temp;
                }
            }
        }
        return smallestElement;
    }

    private static int countElementsBiggerZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        in.close();
    }
}//end of class Solution
