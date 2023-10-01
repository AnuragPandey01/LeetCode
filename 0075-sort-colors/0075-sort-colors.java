class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;        // Initialize a pointer for 0s at the beginning of the array.
        int mid = 0;        // Initialize a pointer for 1s in the middle of the array.
        int high = n - 1;   // Initialize a pointer for 2s at the end of the array.

        while (mid <= high) {
            int curr = nums[mid]; // Current element being considered.

            if (curr == 0) {
                // If the current element is 0, swap it with the element at 'low'.
                swap(nums, low, mid);
                low++;  // Move the 'low' pointer one step to the right.
                mid++;  // Move the 'mid' pointer one step to the right.
            } else if (curr == 1) {
                // If the current element is 1, no need to swap, just move the 'mid' pointer.
                mid++;
            } else {
                // If the current element is 2, swap it with the element at 'high'.
                swap(nums, mid, high);
                high--; // Move the 'high' pointer one step to the left.
            }
        }
    }

    // Helper function to swap two elements in the 'nums' array.
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
