class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0; // If there's only one element, it's the peak.

        if (nums[0] > nums[1]) return 0; // Check if the first element is a peak.
        if (nums[n - 1] > nums[n - 2]) return n - 1; // Check if the last element is a peak.

        int low = 1;  // Initialize the low pointer to the second element.
        int high = n - 2; // Initialize the high pointer to the second-to-last element.

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate the middle index.

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                // If the current element is greater than both its neighbors, it's a peak.
                return mid;
            }

            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                // If the current element is greater than the left neighbor but smaller than the right neighbor,
                // move the low pointer to the right to search for a peak on the right side.
                low = mid + 1;
            } else if (nums[mid] > nums[mid + 1] && nums[mid] < nums[mid - 1]) {
                // If the current element is greater than the right neighbor but smaller than the left neighbor,
                // move the high pointer to the left to search for a peak on the left side.
                high = mid - 1;
            } else {
                // If neither of the above conditions is met, move the low pointer to the right.
                low = mid + 1;
            }
        }

        return -1; // If no peak is found, return -1.
    }

}