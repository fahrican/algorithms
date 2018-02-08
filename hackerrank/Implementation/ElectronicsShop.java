import java.util.Scanner;

public class ElectronicsShop {

    /*
     * @param keyboards[] there are all prices for the keyboards stored as int values
     * @param drives[] there are all prices for the drives stored as int values
     * @return maximum amount of money can spend on a keyboard and USB drive, or -1 if you can't purchase both items
     * */
    static int getMoneySpent(int[] keyboards, int[] drives, int moneyToSpent) {
        // Complete this function
        int amount = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if ((keyboards[i] + drives[j] <= moneyToSpent) && (keyboards[i] + drives[j] > amount))
                    amount = keyboards[i] + drives[j];
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
        in.close();
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}//end of class Solution
