import java.util.Scanner;

public class Solution {

    /*
    * There are two types of clouds, ordinary clouds (c[n] == 0) and thunderclouds (c[n] == 1).
    * The game ends if Emma jumps onto a thundercloud,
    * but if she reaches the last cloud (c[length - 1]), she wins the game!
    * The first cloud (c[0] == 0) and last cloud (c[length - 1] == 0) are always ordinary clouds
    * */
    private static int jumpingOnClouds(int[] c) {
        // Complete this function
        int countJumps = 0;

        for (int i = 0; i < (c.length - 1); i++) {

            if(i < (c.length - 2)){
                if (c[i+2] == 0){
                    countJumps++;
                    i++;
                }
                else if(c[i+1] == 0){
                    countJumps++;
                }
            }
            else if(c[i+1] == 0){
                countJumps++;
            }
        }

        return countJumps;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }

}// end of class Solution
