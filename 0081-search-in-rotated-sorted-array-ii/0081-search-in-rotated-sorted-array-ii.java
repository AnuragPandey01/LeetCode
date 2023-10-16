class Solution {
    public boolean search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){

            int mid = low + (high-low)/2;
            if(nums[mid] ==  target){
                ans = mid;
                break;
            }

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low+1;
                high = high-1;
            }
            else if(nums[low] <= nums[mid]){
                //left sorted
                if(target>=nums[low] && target<= nums[mid]){
                    //target lies in sorted region
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                //rightSorted
                if(target>= nums[mid] && target<=nums[high]){
                    //target lies in sorted region
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        if(ans == -1){
            return false;
        }
        return true;
    }
}