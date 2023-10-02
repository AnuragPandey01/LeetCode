class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Find the first index 'index' from right to 
        // left where nums[index] < nums[index+1].
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If 'index' remains -1, it means the entire array 
        // is in descending order, so reverse it to get the smallest permutation.
        if (index == -1) {
            Arrays.sort(nums);
            return;
        }

        // Find the first element from the right that is greater than 
        // nums[index] and swap them.
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // sort right to ensure its the clossest perm
        Arrays.sort(nums, index + 1, n);
    }

    // Helper function to swap two elements in the 'nums' array.
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}