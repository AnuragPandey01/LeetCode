class Solution {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;  // 7
        int rti = -1;
        int ans = -1;

        while (low < high && high < nums.length) {

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

        if (rti == -1) {
            high = nums.length - 1;
        } else if (target > nums[nums.length - 1]) {
            low = 0;
            high = rti;
        } else {
            low = rti + 1;
            high = nums.length - 1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }

        return ans;

    }
}