import java.util.Scanner;

public class EqualizeTheArray {

    /*
     * @param int[] with duplicate int elements
     * first get most frequent element in the array than start a for loop
     * and count how many elements are different
     * @return number of elements to delete
     * */
    private static int equalizeArray(int[] arr) {
        // Complete this function
        int mostPopularElement = getMostPopularElement(arr);
        int countElementsToDelete = 0;

        for (int i = 0; i < arr.length; i++) {

            if (mostPopularElement != arr[i]) {
                countElementsToDelete++;
            }
        }
        return countElementsToDelete;
    }

    /*
     * @param int[] with duplicate int elements
     * the aim is to find most frequent int in the array
     * @return most frequent int
     * */
    private static int getMostPopularElement(int[] arr) {

        int count = 0;
        int mostPopularElement = -1;

        for (int i = 0; i < arr.length; i++) {

            int tempCount = 0;
            int tempElement = arr[i];
            for (int j = 1; j < arr.length; j++) {

                if (tempElement == arr[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {

                count = tempCount;
                mostPopularElement = tempElement;
            }
        }
        return mostPopularElement;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
