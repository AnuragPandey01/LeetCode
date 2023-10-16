class Solution {
    public int singleNonDuplicate(int[] nums) {
        
    int low = 0;               
    int high = nums.length - 1; 
    int n = nums.length;       
    int ans = -1;           

    while (low <= high) {
        if (low == high) {
            // If low and high pointers meet, we've found the single element.
            ans = nums[low];
            break;
        }

        int mid = low + (high - low) / 2; // Calculate the middle index.

        if (mid > 0 && nums[mid] == nums[mid - 1]) {
            // If the middle element is equal to the element before it, check the left side.
            int leftIndex = mid - 2;
            if (leftIndex >= 0 && leftIndex % 2 == 0) {
                // If the left side has an odd number of elements, the single element is on the left.
                high = leftIndex;
            } else {
                // Otherwise, search the right side.
                low = mid + 1;
            }
        } else if (mid < n - 1 && nums[mid] == nums[mid + 1]) {
            // If the middle element is equal to the element after it, check the right side.
            int rightIndex = mid + 2;
            if (rightIndex < n && (mid - 1) % 2 != 0) {
                // If the right side has an odd number of elements, the single element is on the right.
                low = rightIndex;
            } else {
                // Otherwise, search the left side.
                high = mid - 1;
            }
        } else {
            // If the middle element is not equal to the elements before or after it, it's the single element.
            ans = nums[mid];
            break;
        }
    }

    return ans; // Return the single element.
}

}