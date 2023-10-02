class Solution {
    public int maxProfit(int[] arr) {

        // Approach -1
        // int n = arr.length;
        // int[] premin = new int[n];
        // int[] suffmax = new int[n];

        // int min = arr[0];
        // for (int i = 0; i < n; i++) {
        //     min = Math.min(min,arr[i]);
        //     premin[i] = min;
        // }

        // int max = arr[n-1];
        // int ans = 0;
        // for (int i = n-1; i > 0; i--) {
        //     max =Math.max(max,arr[i]);
        //     ans =  Math.max(ans,max-premin[i]);
        // }
        // return ans;


        //Approact -2

        int n = arr.length;         
        int prefixMin = Integer.MAX_VALUE; // Initialize a variable to keep track of the minimum element seen so far.
        int maxProfit = 0;          // Initialize a variable to store the maximum profit.

        for (int i = 0; i < n; i++) {
            // Calculate the profit if we sell the stock at the current price and bought it at 'prefixMin'.
            int currentProfit = arr[i] - prefixMin;

            // Update the maximum profit if the current profit is greater.
            maxProfit = Math.max(maxProfit, currentProfit);

            // Update 'prefixMin' to the minimum element seen so far.
            prefixMin = Math.min(prefixMin, arr[i]);
        }

        // 'maxProfit' now contains the maximum profit that can be obtained by buying and selling the stock.
        return maxProfit;
    }
}