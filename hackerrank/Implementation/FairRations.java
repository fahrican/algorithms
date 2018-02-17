import java.util.Scanner;
import java.util.stream.IntStream;

public class FairRations {

    /*
    * @param int[]
    * each element in the array represents amount of loave one person has
    * goal is to have only even numbers in the array
    * if you give one loaf to a person you also have to give the person in front of or behind them in the line a loaf
    * you can only give 2 loaf's (current person and  person-1 or person+1) each iteration
    * @return minimum amount of loaves to distribute or 'NO' if it's not possible
    * */
    private static int fairRations(int[] B) {
        // Complete this function
        int amountLoafToDistribute = 0;

        int result = IntStream.of(B).sum();
        if(result % 2 != 0){
            return -1;
        }

        for (int i = 0; i < (B.length - 1); i++) {

            if(B[i] % 2 != 0){

                B[i]++;
                B[i+1]++;
                amountLoafToDistribute+=2;
            }
        }

        return amountLoafToDistribute;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] B = new int[N];
        for (int B_i = 0; B_i < N; B_i++) {
            B[B_i] = in.nextInt();
        }
        int result = fairRations(B);
        if (result >= 0) {
            System.out.println(result);
        } else {
            System.out.println("NO");
        }
        in.close();
    }

}//end of class Solution
