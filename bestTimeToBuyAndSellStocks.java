public class bestTimeToBuyAndSellStocks {

    public static void main(String[] args) {

        // Bruteforce -> Not Optimal , this progam could face TLE error
        // TC : O(N)
        int[] prices = { 1, 7, 2, 99, 0, 99, 3, 2, 1, 101 };
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int maxLocal = Integer.MIN_VALUE;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > maxLocal) {
                    maxLocal = prices[j];
                }
            }
            if (maxLocal <= prices[i]) {
                maxLocal = 0;
            }
            // System.out.println(maxLocal);
            maxProfit = Math.max(maxProfit, maxLocal - prices[i]);

        }
        System.out.println(maxProfit);
        /*------------------------------------------------------------------------------------------------------------------------------- */
        // Optimal solution : suffix cum DP Solution
        // TC: O(N)
        // SC: O(N)
        // Approach : basically we are precomputing the max value till prices[i+1] so
        // instead of traversing the whole array ,
        // we are getting the max value in O(1) so thats optimal approach
        int maxProfit = 0;
        int[] maxArray = new int[prices.length];
        maxArray[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxArray[i] = Integer.max(maxArray[i + 1], prices[i]);
        }
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, maxArray[i] - prices[i]);
        }
        return maxProfit;

        /*------------------------------------------------------------------------------------------------------------------------------- */
        // How can we optimize my code for space to O(1)
        // corrected approach :rather than mapping max ,
        // we can scan map left to right , and make two pointers 1. minumum till i and maxProfit
        // 2.
        int currMin = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < currMin) {
                currMin = prices[i];
            }
            maxProfit = Integer.max(maxProfit, prices[i] - currMin);
        }
        // System.out.println(maxProfit);
        System.out.println(maxProfit);

    }
}
