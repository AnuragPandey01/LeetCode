class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = 1;
        int high = getMax(bloomDay);
        int ans =-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(canMakeMBouquets(mid,m,k,bloomDay)){
                high = mid-1;
                ans = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int num: arr){
            max = Math.max(max,num);
        }
        return max;
    }

    private static boolean canMakeMBouquets(int wait,int m,int k,int[] bloomDay){

        int bouqutes = 0;
        int streak = 0;

        for(int num: bloomDay){

            
            if(num<=wait){
                streak++;
            }else{
                streak = 0;
            }
            if(streak>=k){
                bouqutes++;
                streak -= k;
            }
        }
        return bouqutes>=m;
    }
}