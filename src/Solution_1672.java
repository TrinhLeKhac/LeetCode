/**
 * You are given an m x n integer grid accounts
 * where accounts[i][j] is the amount of money the ith customer has in the jth bank.
 * Return the wealth that the richest customer has.
 * */

public class Solution_1672 {

    public static int maximumWealth(int[][] a) {

        int numberCustomers = a.length;
        int numberBanks = a[0].length;
        int[] wealthOfCustomers = new int[numberCustomers];

        for(int i = 0; i < numberCustomers; i++) {
            for(int j = 0; j < numberBanks; j++) {
                wealthOfCustomers[i] += a[i][j];
            }
        }
        int maxWealth = 0;
        for (int wealthOfCustomer : wealthOfCustomers) {
            if (maxWealth < wealthOfCustomer) {
                maxWealth = wealthOfCustomer;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        int maxWealth = maximumWealth(accounts);
        System.out.println(maxWealth);
    }
}
