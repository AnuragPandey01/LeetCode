class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int[] range = getMinMax(bloomDay);
        int low = range[0];
        int high = range[1];
        int ans = -1;

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

    public static int[] getMinMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int num: arr){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return new int[]{min,max};
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