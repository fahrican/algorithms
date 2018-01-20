import java.util.Scanner;

public class Solution {

    // The Utopian Tree goes through 2 cycles of growth every year. 
    // Each spring, it doubles in height. Each summer, its height increases by 1 meter.
    // After one spring, we have to decrease the cycle by one, same for the summer. 
    static int utopianTree(int n) {
        // Complete this function
        int treeHeight = 1;
        while (n > 0) {

            treeHeight *= 2;
            n--;
            if (n > 0) {
                treeHeight++;
                n--;
            }

        }
        return treeHeight;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }

}// end of class Solution
