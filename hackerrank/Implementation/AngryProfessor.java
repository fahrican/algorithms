import java.util.Scanner;

public class AngryProfessor {

    /*
    * @param 'k' the number of students, who has to attend class, otherwise class will be canceled
    * @param 'a[]' is an array containing positive and negative numbers,
    * negative numbers and 0 are students in time
    * @return YES or NO, depends 'a[]' contains enough 0 and negative numbers for k
    * */
    static String angryProfessor(int k, int[] a) {
        // Complete this function
        int countInTimeStudents = 0;
        for(int i = 0; i < a.length; i++){

            if(a[i] <= 0){
                countInTimeStudents++;
            }
        }

        return  (countInTimeStudents >= k) ? "NO" : "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }

}// end of class Solution
