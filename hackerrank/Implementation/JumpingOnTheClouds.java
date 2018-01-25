import java.util.Scanner;

public class JumpingOnTheClouds {

    /*
     *@param giving a number of clouds as an array, k number of clouds to jump each iteration
     * each iteration the iterator will increase by value of k
     * if at the specific position the value of the index is 0, energyLevel decreases by one
     * if at the specific position the value of the index is 1, energyLevel decreases by three
     * @return rest of energyLevel
     */
    static int jumpingOnClouds(int[] c, int k) {
        // Complete this function
        int energyLevel = 100;
        for (int i = 0; i < c.length; i += k) {

            if (c[i] >= c.length) {
                return energyLevel;
            }
            energyLevel = (c[i] == 0) ? energyLevel - 1 : energyLevel - 3;

        }
        return energyLevel;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
