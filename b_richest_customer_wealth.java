import java.util.*;

public class b_richest_customer_wealth {
    public static void main(String[] args) {
        // Define the array of accounts
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Call the maximumWealth function and print the result
        int maxWealth = maximumWealth(accounts);
        System.out.println("The maximum wealth among customers is: " + maxWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE; // Initialize maxWealth to the minimum possible value

        // Loop through each customer's accounts
        for (int[] customerAccounts : accounts) {
            int sum = 0;

            // Calculate the sum of the customer's accounts
            for (int accountBalance : customerAccounts) {
                sum += accountBalance;
            }

            // Update maxWealth if the current customer's wealth is greater
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
