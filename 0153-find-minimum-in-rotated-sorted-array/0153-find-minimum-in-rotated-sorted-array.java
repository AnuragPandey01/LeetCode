class Solution {
    public int findMin(int[] nums) {

        int low =0;
        int high = nums.length-1;
        int rti = -1;

        while(low<high && high < nums.length){
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                rti = mid;
                break;
            } else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                rti = mid - 1;
                break;
            } else if (nums[mid] > nums[low] && nums[mid] > nums[high]) {
                low = mid + 1;
            } else if (nums[mid] < nums[low] && nums[mid] < nums[high]) {
                high = mid-1;
            }else{
                break;
            }
        }
        
        if(rti == -1){
            return nums[0];
        }
        return nums[rti+1];
    }
}