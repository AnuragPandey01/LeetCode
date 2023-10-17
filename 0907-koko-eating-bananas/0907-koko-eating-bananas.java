class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int low = 1;
        int high = getMax(piles);
        int ans = -1;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            if(canFinishPiles(mid,h,piles)){
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

    public static boolean canFinishPiles(int k,int h,int[] arr){
        long hours = 0;
        for(int num:arr){
            hours += (long)Math.ceil(num/(double)k);
        }
        return hours<=h;
    }
}