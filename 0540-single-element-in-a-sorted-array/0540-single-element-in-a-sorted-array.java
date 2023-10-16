class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low =0;
        int high = nums.length-1;
        int n = nums.length;
        int ans = -1;

        while(low <= high){

            if(low  == high){
                ans =  nums[low];
                break;
            }

            int mid = low +(high-low)/2;

            if( mid >0  && nums[mid] ==  nums[mid-1]){
                int leftIndex = mid-2;
                if(leftIndex >= 0 && leftIndex%2==0){
                    //since leftside has odd no. elements we consider it
                    high = leftIndex;
                }else{
                    low = mid+1;
                }
            }else if(mid < n-1 && nums[mid] == nums[mid+1]){
                int rightIndex = mid+2;
                if(rightIndex < nums.length && (mid-1)%2 != 0){
                    low = rightIndex;
                }else{
                    high =  mid-1;
                }
            }else{
                ans = nums[mid];
                break;
            }

        }

        return ans;
    }
}