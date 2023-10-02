class Solution {

    public int maxProfit(int[] arr) {

        int n = arr.length;
        int prefixMin = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            
            maxProfit = Math.max(maxProfit,arr[i]-prefixMin);
            prefixMin = Math.min(prefixMin,arr[i]);
        }

        return maxProfit;
    }
}