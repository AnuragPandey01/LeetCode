class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =  1;
        int high = getMax(nums);
        int ans =-1;
        while(low<=high){

            int mid = low +(high-low)/2;
            if(isBelowThreshold(mid,threshold,nums)){
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

    private static boolean isBelowThreshold(int div,int threshold,int[] nums){
        int sum =0;
        for(int num: nums){
            sum +=  (int)Math.ceil((double)num/div);
        }
        return sum<=threshold;
    }
}