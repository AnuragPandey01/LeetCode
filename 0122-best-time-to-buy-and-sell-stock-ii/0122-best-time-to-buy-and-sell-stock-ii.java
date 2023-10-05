class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;

        int i =0;
        int ans = 0;
        while(i<n-1){

            if(arr[i] >= arr[i+1]){
                i++;
                continue;
            }
            int j = i+1;
            while(j < n-1 && arr[j] < arr[j+1]){
                j++;
            }
            if(arr[j]-arr[i] > 0){
                ans += arr[j]-arr[i];
                i = j;
            }else{
                break;
            }
            i++;
        }

        return ans;
    }
}