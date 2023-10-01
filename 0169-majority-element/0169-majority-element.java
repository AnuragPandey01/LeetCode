class Solution {
    public int majorityElement(int[] nums) {
        // Initialize variables to keep track of the current majority element and its count.
        int count = 1;
        int ele = nums[0]; // Assume the first element as the initial candidate for majority.

        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i]; // Current element being considered.

            // If the count of the current majority element reaches zero, update the candidate.
            if (count == 0) {
                ele = nums[i];
                count++;
            } else if (curr == ele) {
                // If the current element is the same as the current majority candidate, increment the count.
                count++;
            } else {
                // If the current element is different, decrement the count.
                count--;
            }
        }

        // The 'ele' variable now contains the majority element after processing the entire array.
        return ele;
    }

}