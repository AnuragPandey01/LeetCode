class Solution {
            public int maxProfit(int[] arr) {
        int n = arr.length;
        int[] premin = new int[n];
        int[] suffmax = new int[n];

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(min,arr[i]);
            premin[i] = min;
        }

        int max = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            max =Math.max(max,arr[i]);
            suffmax[i] = max;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,suffmax[i]-premin[i]);
        }

        System.out.println(ans);
        return ans;
    }
}