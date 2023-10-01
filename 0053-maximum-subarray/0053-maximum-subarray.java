class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE; // Initialize the maximum sum to the smallest possible integer value.
        int sum = 0; // Initialize a variable to keep track of the current sum.

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i]; // Current element being considered.

            sum += curr; // Add the current element to the current sum.

            if (sum > max) {
                // If the current sum is greater than the current maximum, update the maximum.
                max = sum;
            }

            if (sum < 0) {
                // If the current sum becomes negative, reset it to zero.
                sum = 0;
            }
        }

        // 'max' now contains the maximum subarray sum after processing the entire array.
        return max;
    }

}